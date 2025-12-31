import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 9288 - More Dice
// https://www.acmicpc.net/problem/9288
public class B9288_More_Dice {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("Case ").append(tc).append(":\n");
			int sum = Integer.parseInt(br.readLine());
			for (int i = 1; i <= 6; i++) {
				int j = sum - i;
				if (j < i) {
					break;
				}
				if (j >= 1 && j <= 6) {
					sb.append("(").append(i).append(",").append(j).append(")\n");
				}
			}
		}
		System.out.println(sb);
		br.close();
	}
}
