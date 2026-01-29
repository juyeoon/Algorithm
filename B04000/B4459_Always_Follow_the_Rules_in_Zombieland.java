import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 4459 - Always Follow the Rules in Zombieland
// https://www.acmicpc.net/problem/4459
public class B4459_Always_Follow_the_Rules_in_Zombieland {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int q = Integer.parseInt(br.readLine());
		String[] quotes = new String[q + 1];
		for (int i = 1; i <= q; i++) {
			quotes[i] = br.readLine();
		}
		int r = Integer.parseInt(br.readLine());
		for (int i = 0; i < r; i++) {
			int rule = Integer.parseInt(br.readLine());
			sb.append("Rule ").append(rule).append(": ");
			sb.append((rule >= 1 && rule <= q) ? quotes[rule] : "No such rule").append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
