import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/13240
// 체스판의 좌표의 x와 y의 합이 짝수면 '*', 홀수면 '.' 출력 (좌표 0부터 시작)
public class B13240_Chessboard {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 행
		int M = Integer.parseInt(st.nextToken()); // 열
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if ((i + j) % 2 == 0) { // 좌표 합이 짝수
					sb.append("*");
				} else { // 홀수
					sb.append(".");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
