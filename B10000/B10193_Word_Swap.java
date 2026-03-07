import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/10193
public class B10193_Word_Swap {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String word1 = st.nextToken();
			String word2 = st.nextToken();
			sb.append("Swapping letters to make ").append(word1);
			sb.append(" look like ").append(word2);
			int len = word1.length();
			int coins = 0;
			for (int i = 0; i < len; i++) {
				char c1 = word1.charAt(i);
				char c2 = word2.charAt(i);
				int diff = c1 - c2;
				coins += diff;
			}
			if (coins == 0) {
				sb.append(" was FREE.");
			} else if (coins < 0) {
				sb.append(" cost ").append(Math.abs(coins)).append(" coins.");
			} else {
				sb.append(" earned ").append(Math.abs(coins)).append(" coins.");
			}
			sb.append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
