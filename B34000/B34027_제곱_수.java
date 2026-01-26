import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/34027
public class B34027_제곱_수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			long N = Long.parseLong(br.readLine());
			double sqrtN = Math.sqrt(N);
			if (sqrtN == (int) sqrtN) {
				sb.append(1);
			} else {
				sb.append(0);
			}
			sb.append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
