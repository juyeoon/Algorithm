import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 반복문을 이용하여 구하기
public class B10870_피보나치_수_5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // n!
		if (n == 0) { // 0! = 0
			System.out.println(0);
		} else {
			int dp[] = new int[n + 1]; // [1]~[n]
			dp[0] = 0;
			dp[1] = 1;
			for (int i = 2; i <= n; i++) { // dp에 값 넣기
				dp[i] = dp[i - 1] + dp[i - 2];
			}
			System.out.println(dp[n]); // 출력
		}
		br.close();
	}
}
