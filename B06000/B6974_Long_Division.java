import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// 6974 - Long Division
// https://www.acmicpc.net/problem/6974
public class B6974_Long_Division {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			BigInteger dividend = new BigInteger(br.readLine());
			BigInteger divisor = new BigInteger(br.readLine());
			BigInteger quotient = dividend.divide(divisor);
			BigInteger remainder = dividend.remainder(divisor);
			sb.append(quotient).append("\n");
			sb.append(remainder).append("\n\n");
		}
		System.out.println(sb);
		br.close();
	}
}
