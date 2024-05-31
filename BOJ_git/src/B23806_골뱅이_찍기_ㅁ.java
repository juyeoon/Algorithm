import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ('@' N*5개) N줄 
// ('@' N개 , ' ' N*3개, '@' N개) N*3줄
// ('@' N*5개) N줄 출력
public class B23806_골뱅이_찍기_ㅁ {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) { // ('@' N*5개) N줄
			for (int j = N * 5; j > 0; j--) {
				sb.append('@');
			}
			sb.append("\n");
		}
		for (int i = N * 3; i > 0; i--) { // ('@' N개 , ' ' N*3개, '@' N개) N*3줄
			for (int j = 0; j < N; j++) {
				sb.append('@');
			}
			for (int j = N * 3; j > 0; j--) {
				sb.append(' ');
			}
			for (int j = 0; j < N; j++) {
				sb.append('@');
			}
			sb.append("\n");
		}
		for (int i = 0; i < N; i++) { // ('@' N*5개) N줄
			for (int j = N * 5; j > 0; j--) {
				sb.append('@');
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}