import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력받는 수가 큰 수 이므로
// 일의 숫자가 짝수면 전체 숫자가 짝수
// 일의 숫자가 홀수면 전체 숫자가 홀수
public class B5988_홀수일까_짝수일까 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 입력 수 개수
		for (int i = 0; i < N; i++) {
			String K = br.readLine(); // 입력 수
			int last = K.charAt(K.length() - 1) - 48; // 입력 수의 일의 자리 숫자
			sb.append((last % 2 == 0) ? "even\n" : "odd\n"); // 일의 자리 숫자가 짝수면 even 홀수면 odd
		}
		System.out.println(sb); // 출력
		br.close();
	}
}