import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 12174 - #include <Google I/O.h>
// https://www.acmicpc.net/problem/12174
public class B12174_include_Google_I_O_h {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int B = Integer.parseInt(br.readLine());
			String bits = br.readLine();
			StringBuilder msg = new StringBuilder();
			for (int i = 0; i < B; i++) {
				int v = 0;
				for (int j = 0; j < 8; j++) {
					v <<= 1;
					char c = bits.charAt(i * 8 + j);
					if (c == 'I') {
						v |= 1;
					}
				}
				msg.append((char) v);
			}
			sb.append("Case #").append(tc).append(": ").append(msg).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
