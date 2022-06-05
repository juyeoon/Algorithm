import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 행렬 A를 2차원 배열에 저장 후, 행렬 B의 값을 받아옴과 동시에 계산
public class B2738_행렬_덧셈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 행 개수
		int M = Integer.parseInt(st.nextToken()); // 열 개수
		int A[][] = new int[N][M]; // 행렬 A
		for (int i = 0; i < N; i++) { // input A
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for (int i = 0; i < N; i++) { // A + B
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				sb.append(Integer.parseInt(st.nextToken()) + A[i][j]).append(" "); // A + B
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
	}
}
