import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 5753 - Pascal Library
// https://www.acmicpc.net/problem/5753
public class B5753_Pascal_Library {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("0 0")) {
			StringTokenizer st = new StringTokenizer(s);
			int N = Integer.parseInt(st.nextToken());
			int D = Integer.parseInt(st.nextToken());
			boolean[] notAttended = new boolean[N];
			for (int d = 0; d < D; d++) {
				st = new StringTokenizer(br.readLine());
				for (int i = 0; i < N; i++) {
					int x = Integer.parseInt(st.nextToken());
					if (x == 0) {
						notAttended[i] = true;
					}
				}
			}
			boolean exists = false;
			for (int i = 0; i < N; i++) {
				if (!notAttended[i]) {
					exists = true;
					break;
				}
			}
			sb.append(exists ? "yes" : "no").append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
