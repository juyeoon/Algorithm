import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 6845 - Federal Voting Age
// https://www.acmicpc.net/problem/6845
public class B6845_Federal_Voting_Age {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int cutoffYear = 1989;
		int cutoffMonth = 2;
		int cutoffDay = 27;
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int y = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			boolean yes = true;
			if (y < cutoffYear) {
				yes = true;
			} else if (y > cutoffYear) {
				yes = false;
			} else {
				if (m < cutoffMonth) {
					yes = true;
				} else if (m > cutoffMonth) {
					yes = false;
				} else {
					if (d <= cutoffDay) {
						yes = true;
					} else {
						yes = false;
					}
				}
			}
			sb.append(yes ? "Yes" : "No").append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
