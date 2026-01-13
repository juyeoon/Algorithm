import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/12518
public class B12518_Centauri_Prime_Small2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			String s = br.readLine();
			char c = Character.toLowerCase(s.charAt(s.length() - 1));
			sb.append("Case #").append(tc).append(": ").append(s).append(" is ruled by ");
			if (c == 'y') {
				sb.append("nobody");
			} else if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				sb.append("a queen");
			} else {
				sb.append("a king");
			}
			sb.append(".\n");
		}
		System.out.println(sb);
		br.close();
	}
}
