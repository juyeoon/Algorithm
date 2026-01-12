import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/4581
public class B4581_Voting {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("#")) {
			int len = s.length();
			int absent = 0;
			int yes = 0;
			int no = 0;
			for (int i = 0; i < len; i++) {
				char c = s.charAt(i);
				if (c == 'A') {
					absent++;
				} else if (c == 'Y') {
					yes++;
				} else if (c == 'N') {
					no++;
				}
			}
			if (absent * 2 >= len) {
				sb.append("need quorum");
			} else {
				if (yes > no) {
					sb.append("yes");
				} else if (no > yes) {
					sb.append("no");
				} else {
					sb.append("tie");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
