import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1부터 n까지의 합공식을 이용하여 합을 구하고 곱하기
// 합을 곱할 때마다 14579 나누기 (모듈러 연산)
public class B14579_덧셈과_곱셈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int a = Integer.parseInt(s[0]); // a
		int b = Integer.parseInt(s[1]); // b
		long ans = 1; // 출력값
		for (int i = a; i <= b; i++) { // 1부터 a의 합부터 1부터 b까지의 곱 구하기
			ans *= i * (i + 1) / 2; // 1부터 i까지의 합을 곱하기
			ans %= 14579; // 14579 나누기
		}
		System.out.println(ans); // 출력
		br.close();
	}
}
