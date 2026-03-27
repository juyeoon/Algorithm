import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26590 - Word Mix
// https://www.acmicpc.net/problem/26590
public class B26590_Word_Mix {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		int len = Math.min(s1.length(), s2.length());
		for (int i = 0; i < len; i++) {
			sb.append(i % 2 == 0 ? s1.charAt(i) : s2.charAt(i));
		}
		System.out.println(sb);
		br.close();
	}
}
