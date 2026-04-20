import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 27913 - SciComLove (2023)
// https://www.acmicpc.net/problem/27913
public class B27913_SciComLove_2023 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		String S = "SciComLove";
		int full = N / 10;
		int rem = N % 10;
		int cnt = full * 3;
		for (int i = 0; i < rem; i++) {
			if (Character.isUpperCase(S.charAt(i))) {
				cnt++;
			}
		}
		boolean[] flipped = new boolean[N];
		for (int i = 0; i < Q; i++) {
			int x = Integer.parseInt(br.readLine()) - 1;
			boolean originallyUpper = Character.isUpperCase(S.charAt(x % 10));
			if (!flipped[x]) {
				if (originallyUpper) {
					cnt--;
				} else {
					cnt++;
				}
			} else {
				if (originallyUpper) {
					cnt++;
				} else {
					cnt--;
				}
			}
			flipped[x] = !flipped[x];
			sb.append(cnt).append("\n");
		}
		System.out.print(sb);
		br.close();
	}
}
