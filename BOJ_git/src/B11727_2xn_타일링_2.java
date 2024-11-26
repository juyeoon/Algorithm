import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/11727
// n번째 개수는 n-1번째의 개수랑 (n-2번째의 개수)*2의 합 (직접 그려보면 알 수 있음)
// dp로 n번째까지의 개수를 계속해서 찾기
public class B11727_2xn_타일링_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int dp[] = new int[n + 2]; // 입력이 1칸 일때 dp[2]에서 안 걸리기 위해 +1이 아니고 +2
		dp[1] = 1; // 2x1칸
		dp[2] = 3; // 2x2칸
		for (int i = 3; i <= n; i++) { // dp 구하기
			dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10007; // 나머지를 더한 값의 나머지는 같음
		}
		System.out.println(dp[n]); // 출력
		br.close();
	}
}
