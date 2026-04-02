import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 9297 - Reducing Improper Fractions
// https://www.acmicpc.net/problem/9297
public class B9297_Reducing_Improper_Fractions {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			sb.append("Case ").append(tc).append(": ");
			int I = n / d;
			int N = n % d;
			if (I != 0) {
				sb.append(n / d).append(" ");
			}
			if (N != 0) {
				sb.append(n % d).append("/").append(d);
			}
			if (I == 0 && N == 0) {
				sb.append(0);
			}
			sb.append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
