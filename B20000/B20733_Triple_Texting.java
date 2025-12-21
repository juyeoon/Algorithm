import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/20733
public class B20733_Triple_Texting {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		int leng = s.length();
		int n = leng / 3;
		String a = s.substring(0, n);
		String b = s.substring(n, 2 * n);
		String c = s.substring(2 * n, 3 * n);
		for (int i = 0; i < n; i++) {
			char ca = a.charAt(i);
			char cb = b.charAt(i);
			char cc = c.charAt(i);
			if (ca == cb || ca == cc) {
				sb.append(ca);
			} else {
				sb.append(cb);
			}
		}
		System.out.println(sb);
		br.close();
	}
}
