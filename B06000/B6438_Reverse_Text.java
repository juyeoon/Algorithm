import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 6438 - Reverse Text
// https://www.acmicpc.net/problem/6438
public class B6438_Reverse_Text {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringBuilder sbTmp = new StringBuilder(br.readLine());
			sb.append(sbTmp.reverse().toString()).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
