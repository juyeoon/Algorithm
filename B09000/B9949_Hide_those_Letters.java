import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 9949 - Hide those Letters
// https://www.acmicpc.net/problem/9949
public class B9949_Hide_those_Letters {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = 1;
		String s = "";
		while (!(s = br.readLine()).equals("# #")) {
			StringTokenizer st = new StringTokenizer(s);
			char a = st.nextToken().charAt(0);
			char b = st.nextToken().charAt(0);
			int n = Integer.parseInt(br.readLine());
			sb.append("Case ").append(t).append("\n");
			for (int i = 0; i < n; i++) {
				s = br.readLine();
				StringBuilder sbTmp = new StringBuilder();
				for (int j = 0; j < s.length(); j++) {
					char c = s.charAt(j);
					char lower = Character.toLowerCase(c);
					if (lower == a || lower == b) {
						sbTmp.append('_');
					} else {
						sbTmp.append(c);
					}
				}
				sb.append(sbTmp.toString()).append("\n");
			}
			sb.append("\n");
			t++;
		}
		System.out.println(sb);
	}
}
