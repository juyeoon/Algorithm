import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/13456
// 두 벡터의 원소를 1차원 배열에 넣고 같은 위치의 값을 비교하여 같지 않은 값 개수 세기
public class B13456_Richard_Hamming {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스
		for (int tc = 1; tc <= T; tc++) {
			int n = Integer.parseInt(br.readLine());
			int[] v = new int[n]; // 벡터 v
			int[] u = new int[n]; // 벡터 u
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) { // v[] 입력
				v[i] = Integer.parseInt(st.nextToken());
			}
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) { // u[] 입력
				u[i] = Integer.parseInt(st.nextToken());
			}
			int cnt = 0;
			for (int i = 0; i < n; i++) {
				if (v[i] != u[i]) { // 서로 다른 원소
					cnt++;
				}
			}
			sb.append(cnt).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
