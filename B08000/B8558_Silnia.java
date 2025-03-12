import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// n!의 일의 자리 숫자를 출력하는 문제
// n이 5 이상일 때는 값이 10의 배수이므로 일의 자리가 0
// n이 4일 때는 24이므로 4
// n이 3 이하일 때는 값이 한자리 수이므로 n! 출력
public class B8558_Silnia {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // n!의 n
		if (n >= 5) { // n이 5 이상일 때는 0 출력
			System.out.println(0);
		} else if (n == 4) { // n이 4일 때는 4 출력
			System.out.println(4);
		} else { // n이 3 이하일 때는 n! 출력
			int ans = 1;
			for (int i = 1; i <= n; i++) {
				ans *= i;
			}
			System.out.println(ans);
		}
		br.close();
	}
}