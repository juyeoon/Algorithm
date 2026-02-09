import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 5220 - Error Detection
// https://www.acmicpc.net/problem/5220
public class B5220_Error_Detection {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int v = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int cnt1 = Integer.bitCount(v);
			int ec = (cnt1 % 2 == 1) ? 1 : 0;
			sb.append((ec == c) ? "Valid" : "Corrupt").append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
