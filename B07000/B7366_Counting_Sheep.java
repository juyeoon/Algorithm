import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 7366 - Counting Sheep
// https://www.acmicpc.net/problem/7366
public class B7366_Counting_Sheep {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int m = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int cnt = 0;
			for (int i = 0; i < m; i++) {
				if (st.nextToken().equals("sheep")) {
					cnt++;
				}
			}
			sb.append("Case ").append(tc).append(": This list contains ").append(cnt).append(" sheep.\n\n");
		}
		System.out.println(sb);
		br.close();
	}
}
