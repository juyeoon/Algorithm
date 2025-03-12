import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// AxB = AB일 때
// AB[i][j] = Σ(A[i][l] * B[l][j]) (l=0,1,...M-1)
public class B2740_행렬_곱셈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		// 행렬 A (N*M) 입력 및 저장
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] A = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		// 행렬 B (M*K) 입력 및 저장
		st = new StringTokenizer(br.readLine());
		st.nextToken();
		int K = Integer.parseInt(st.nextToken());
		int[][] B = new int[M][K];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < K; j++) {
				B[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		// AB = AxB
		int[][] AB = new int[N][K];
		for (int i = 0; i < N; i++) { // AB의 행
			for (int j = 0; j < K; j++) { // AB의 열
				for (int l = 0; l < M; l++) { // A와 B의 인덱스
					AB[i][j] += A[i][l] * B[l][j]; // 행렬 곱 구하기
				}
			}
		}
		// AB[][] 출력 저장
		for (int[] is : AB) {
			for (int is2 : is) {
				sb.append(is2).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
