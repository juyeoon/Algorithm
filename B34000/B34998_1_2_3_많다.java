import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 34998 - 1, 2, 3, 많다!
// https://www.acmicpc.net/problem/34998
public class B34998_1_2_3_많다 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int X = Integer.parseInt(br.readLine());
			String s = br.readLine().replaceAll("!", "10");
			StringTokenizer st = new StringTokenizer(s);
			int ans = Integer.parseInt(st.nextToken());
			for (int i = 0; i < X; i++) {
				st.nextToken();
				ans += Integer.parseInt(st.nextToken());
			}
			sb.append(ans > 9 ? "!" : ans).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
