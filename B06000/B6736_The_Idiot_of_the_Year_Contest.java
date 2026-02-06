import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

// 6736 - The Idiot of the Year Contest!
// https://www.acmicpc.net/problem/6736
public class B6736_The_Idiot_of_the_Year_Contest {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			char digit = st.nextToken().charAt(0);
			BigInteger fact = factorial(n);
			String factS = fact.toString();

			int cnt = 0;
			for (int i = 0; i < factS.length(); i++) {
				if (factS.charAt(i) == digit) {
					cnt++;
				}
			}
			sb.append(cnt).append("\n");
		}
		System.out.println(sb);
		br.close();
	}

	public static BigInteger factorial(int n) {
		BigInteger result = BigInteger.ONE;
		for (int i = 2; i <= n; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}
}
