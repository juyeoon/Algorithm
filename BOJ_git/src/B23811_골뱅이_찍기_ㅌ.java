import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// N*5개 N줄
// N개 N줄
// N*5개 N줄 
// N개 N줄
// N*5개 N줄 출력
public class B23811_골뱅이_찍기_ㅌ {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) { // N*5개 N줄
			for (int j = N * 5; j > 0; j--) {
				sb.append('@');
			}
			sb.append("\n");
		}
		for (int i = N; i > 0; i--) { // N개 N줄
			for (int j = 0; j < N; j++) {
				sb.append('@');
			}
			sb.append("\n");
		}
		for (int i = 0; i < N; i++) { // N*5개 N줄
			for (int j = N * 5; j > 0; j--) {
				sb.append('@');
			}
			sb.append("\n");
		}
		for (int i = N; i > 0; i--) { // N개 N줄
			for (int j = 0; j < N; j++) {
				sb.append('@');
			}
			sb.append("\n");
		}
		for (int i = 0; i < N; i++) { // N*5개 N줄
			for (int j = N * 5; j > 0; j--) {
				sb.append('@');
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}