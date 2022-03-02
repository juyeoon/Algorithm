

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2775_부녀회장이_될테야 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			System.out.println(calkon(k, n));
		}
		br.close();
	}

	public static int calkon(int k, int n) {
		if (k == 0) {
			return n;
		} else if (n == 1) {
			return 1;
		} else {
			return calkon(k - 1, n) + calkon(k, n - 1);
		}
	}
}
