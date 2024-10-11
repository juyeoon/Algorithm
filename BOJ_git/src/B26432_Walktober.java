import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2차원 배열에 걸음 수를 저장 (행: 같은 날, 열: 같은 참가자)
// 열을 반복하면서 해당 열의 최댓값(행 반복)을 찾고 john의 걸음수와 비교해서 john과의 차이의 합을 출력
public class B26432_Walktober {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken()); // 참가자의 수
			int N = Integer.parseInt(st.nextToken()); // 일 수
			int P = Integer.parseInt(st.nextToken()); // John의 ID
			int w[][] = new int[M + 1][N + 1]; // 걸음 수
			for (int i = 1; i <= M; i++) { // w[][] 채우기
				st = new StringTokenizer(br.readLine());
				for (int j = 1; j <= N; j++) {
					w[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			int sum = 0; // 각 날의 모자란 걸음 수의 합
			for (int i = 1; i <= N; i++) { // 날 수만큼 반복
				int john = w[P][i]; // 그날의 john의 걸음 수
				int max = john; // john보다 많이 걸은 사람중 최대 걸음 수
				for (int j = 1; j <= M; j++) { // 참가자 수만큼 반복
					if (max < w[j][i]) { // 최댓값 찾기
						max = w[j][i];
					}
				}
				sum += max - john; // 모자란 걸음 수 합치기
			}
			sb.append("Case #").append(tc).append(": ").append(sum).append("\n"); // 출력
		}
		System.out.println(sb);
		br.close();
	}
}