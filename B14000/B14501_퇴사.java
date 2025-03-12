import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// DP - i~N까지 최대 금액을 저장하는 dp배열 사용
public class B14501_퇴사 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 일 수
		int[] T = new int[N + 1]; // 걸리는 기간
		int[] P = new int[N + 1]; // 금액
		int[] dp = new int[N + 1]; // i~N까지 최대 금액을 저장
		for (int i = 1; i <= N; i++) {
			String s[] = br.readLine().split(" ");
			T[i] = Integer.parseInt(s[0]);
			P[i] = Integer.parseInt(s[1]);
		} // input
		dp[N] = T[N] == 1 ? P[N] : 0; // 마지막 날
		for (int i = N - 1; i >= 1; i--) { // 뒤에서 부터 계산
			if (T[i] > N - i + 1) { // 기간 넘어감
				dp[i] = dp[i + 1];
			} else if (T[i] == N - i + 1) { // 기간이 남은 날짜가 같음
				dp[i] = Math.max(P[i], dp[i + 1]); // max(선택, 비선택)
			} else {
				dp[i] = Math.max(P[i] + dp[i + T[i]], dp[i + 1]); // max(선택, 비선택)
			}
		}
		System.out.println(dp[1]);
		br.close();
	}
}
