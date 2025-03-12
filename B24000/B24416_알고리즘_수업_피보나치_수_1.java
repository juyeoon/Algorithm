import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 재귀호출 코드 호출 횟수 => fib[n] = fib[n-1] + fib[n-2] => 다이나믹프로그래밍으로 해결
// 동적 프로그래밍 코드 회출 횟수 => 3부터 n까지 반복 => n-2
public class B24416_알고리즘_수업_피보나치_수_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // n
		int dp[] = new int[n + 1]; // 재귀 호출 코드1 호출 횟수 저장 배열
		dp[1] = 1;
		dp[2] = 1;
		for (int i = 3; i <= n; i++) { // n까지 dp[] 채우기
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		sb.append(dp[n]).append(" ").append(n - 2); // 코드1 호출 횟수 코드2 호출 횟수
		System.out.println(sb); // 호출
		br.close();
	}
}