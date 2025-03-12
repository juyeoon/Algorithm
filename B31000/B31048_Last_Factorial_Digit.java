import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// N!의 일의 자리 숫자를 출력하는 문제 N>=5부터는 10의 배수이므로 0
// 따라서 N이 1, 2, 3, 4, 5이상으로 구분하여 출력
public class B31048_Last_Factorial_Digit {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			int N = Integer.parseInt(br.readLine()); // N!
			if (N == 1) { // 1
				sb.append(1);
			} else if (N == 2) { // 2
				sb.append(2);
			} else if (N == 3) { // 3
				sb.append(6);
			} else if (N == 4) { // 4
				sb.append(4);
			} else { // 5 이상
				sb.append(0);
			}
			sb.append("\n");
		}

		System.out.println(sb); // 출력
		br.close();
	}
}