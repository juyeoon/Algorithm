import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 4118 - Fred’s Lotto Tickets
// https://www.acmicpc.net/problem/4118
public class B4118_Fred_s_Lotto_Tickets {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("0")) {
			int N = Integer.parseInt(s);
			boolean[] num = new boolean[50];
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 6; j++) {
					num[Integer.parseInt(st.nextToken())] = true;
				}
			}
			boolean ans = true;
			for (int i = 1; i <= 49; i++) {
				if (!num[i]) {
					ans = false;
					break;
				}
			}
			sb.append(ans ? "Yes" : "No").append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
