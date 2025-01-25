import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/28417
// 7개의 수 중에 앞의 2개의 수 중 최댓값, 뒤의 5개의 수 중 최댓값 2개를 더한 값을
// 각 입력 라인 중 최댓값을 찾아서 출력
public class B28417_스케이트보드 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 사람의 수
		int max = 0; // 총 최댓값(출력값)
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int sum = Math.max(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())); // 앞의 두 수 중 최댓값
			int trick[] = new int[5];
			for (int j = 0; j < 5; j++) {
				trick[j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(trick);
			sum += trick[4] + trick[3]; // 뒤의 5개의 수 중 최댓값 2개
			max = Math.max(max, sum); // 최댓값 갱신
		}
		System.out.println(max); // 출력
		br.close();
	}
}
