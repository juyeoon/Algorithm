import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 15178 - Angles
// https://www.acmicpc.net/problem/15178
public class B15178_Angles {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if (a + b + c == 180) {
				sb.append(a).append(" ").append(b).append(" ").append(c).append(" Seems OK\n");
			} else {
				sb.append(a).append(" ").append(b).append(" ").append(c).append(" Check\n");
			}
		}
		System.out.println(sb);
		br.close();
	}
}
