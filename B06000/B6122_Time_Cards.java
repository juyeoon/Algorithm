import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 6122 - Time Cards
// https://www.acmicpc.net/problem/6122
public class B6122_Time_Cards {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int nLines = Integer.parseInt(st.nextToken());
		int[] total = new int[n + 1];
		int[] start = new int[n + 1];
		for (int i = 0; i < nLines; i++) {
			st = new StringTokenizer(br.readLine());
			int cow = Integer.parseInt(st.nextToken());
			String type = st.nextToken();
			int hh = Integer.parseInt(st.nextToken());
			int mm = Integer.parseInt(st.nextToken());
			int time = hh * 60 + mm;
			if (type.equals("START")) {
				start[cow] = time;
			} else {
				total[cow] += time - start[cow];
			}
		}
		for (int i = 1; i <= n; i++) {
			sb.append(total[i] / 60).append(" ").append(total[i] % 60).append("\n");
		}
		System.out.print(sb);
		br.close();
	}
}
