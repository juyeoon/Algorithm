import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//dp 사용
//dp[n] = dp[n-1] + dp[n-2] + dp[n-3]
public class B9095_1_2_3_더하기 {
	public static int n, dp[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		dp = new int[11]; // n은 10이하
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		for (int i = 0; i < T; i++) {
			sb.append(memo(Integer.parseInt(br.readLine()))).append("\n");
		}
		System.out.println(sb);
		br.close();
	}

	public static int memo(int n) { // dp 계산
		if (dp[n] == 0) { // 데이터가 없으면
			dp[n] = memo(n - 1) + memo(n - 2) + memo(n - 3); // 데이터 계산하여 dp에 추가(memoization)
		}
		return dp[n];
	}
}
