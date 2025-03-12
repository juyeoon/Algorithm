import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 모든 상점을 방문하고 차로 돌아오는 최소 거리는 주차장의 위치와 상관 없이
// 상점을 거리 순서로 정렬 후 상점 사이의 거리의 합의 2배
public class B5054_주차의_신 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			int N = Integer.parseInt(br.readLine()); // 상점 개수
			String s[] = br.readLine().split(" ");
			int num[] = new int[N]; // 상점 위치
			for (int i = 0; i < N; i++) { // input num[]
				num[i] = Integer.parseInt(s[i]);
			}
			Arrays.sort(num); // 오름차순으로 정렬
			int ans = 0; // 총 거리
			for (int i = N - 1; i > 0; i--) { // 상점 사이의 거리 구하기
				ans += num[i] - num[i - 1];
			}
			sb.append(ans * 2).append("\n"); // 상점 거리 * 2
		}
		System.out.println(sb); // 출력
		br.close();
	}
}