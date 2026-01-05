import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 32342 - 와우와 쿼리
// https://www.acmicpc.net/problem/32342
public class B32342_와우와_쿼리 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int Q = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < Q; tc++) {
			String s = br.readLine();
			long cnt = 0;
			for (int i = 0; i + 2 < s.length(); i++) {
				if (s.charAt(i) == 'W' && s.charAt(i + 1) == 'O' && s.charAt(i + 2) == 'W') {
					cnt++;
				}
			}
			sb.append(cnt).append("\n");
		}
		System.out.print(sb);
		br.close();
	}
}
