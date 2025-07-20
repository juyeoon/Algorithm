import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 12354 - Ocean View (Small)
// https://www.acmicpc.net/problem/12354
public class B12354_Ocean_View_Small {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("Case #").append(tc).append(": ");
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] height = new int[N];
			for (int i = 0; i < N; i++) {
				height[i] = Integer.parseInt(st.nextToken());
			}
			int[] dp = new int[N];
			dp[0] = 1;
			int maxLeng = 1;
			for (int i = 1; i < N; i++) {
				dp[i] = 1;
				for (int j = 0; j < i; j++) {
					if (height[j] < height[i]) {
						dp[i] = Math.max(dp[i], dp[j] + 1);
					}
				}
				maxLeng = Math.max(maxLeng, dp[i]);
			}
			sb.append(N - maxLeng).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
