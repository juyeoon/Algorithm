import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/32399
public class B32399_햄버거_정렬 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String target = "(1)";
		int ans = Integer.MAX_VALUE;
		if (s.equals(target)) {
			ans = 0;
		} else {
			boolean oneMove = false;
			for (int i = 0; i < 3 && !oneMove; i++) {
				char removed = s.charAt(i);
				StringBuilder base = new StringBuilder();
				for (int k = 0; k < 3; k++) {
					if (k != i) {
						base.append(s.charAt(k));
					}
				}
				for (int j = 0; j <= 2; j++) {
					StringBuilder t = new StringBuilder(base);
					t.insert(j, removed);
					if (t.toString().equals(target)) {
						oneMove = true;
						break;
					}
				}
			}
			ans = oneMove ? 1 : 2;
		}
		System.out.println(ans);
		br.close();
	}
}
