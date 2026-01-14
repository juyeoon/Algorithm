import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 3486 - Adding Reversed Numbers
// https://www.acmicpc.net/problem/3486
public class B3486_Adding_Reversed_Numbers {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			StringBuilder tsb1 = new StringBuilder(st.nextToken());
			int ra = Integer.parseInt(tsb1.reverse().toString());
			StringBuilder tsb2 = new StringBuilder(st.nextToken());
			int rb = Integer.parseInt(tsb2.reverse().toString());
			int sum = ra + rb;
			String ans = new StringBuilder(String.valueOf(sum)).reverse().toString();
			sb.append(Integer.parseInt(ans)).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
