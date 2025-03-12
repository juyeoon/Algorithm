import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 첫 번째 줄 '*...*' N개 출력
// 두 번째 줄 ' ' N/2개, '*', ' ' N/2개 출력
// 세 번째 이후 줄 공백 '*' 공백 '*' 순서
// 뒤쪽 공백은 출력하면 안 됨
public class B14624_전북대학교 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 정수 N
		if (N % 2 == 0) { // N이 짝수일 떄
			sb.append("I LOVE CBNU");
		} else { // N이 홀수일 때
			for (int i = 0; i < N; i++) { // 첫 번째 줄 'ㅡ'
				sb.append('*');
			}
			sb.append("\n");

			for (int i = 0; i < N / 2; i++) { // 두 번째 줄 ' * '
				sb.append(' ');
			}
			sb.append("*\n");

			// 세 번째 줄 ' * * '
			for (int j = N / 2 - 1, k = 1; j >= 0; j--, k += 2) {
				for (int i = 0; i < j; i++) { // '*'의 앞쪽 공백
					sb.append(' ');
				}
				sb.append('*'); // 첫 번째 '*'
				for (int i = 0; i < k; i++) { // 가운데 공백
					sb.append(' ');
				}
				sb.append("*\n"); // 두 번째 '*'
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}