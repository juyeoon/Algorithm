import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/14429
public class B14429_배스킨라빈스_31 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int minCnt = Integer.MAX_VALUE;
		int minIdx = 0;
		for (int i = 1; i <= n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int j = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int r = (j - 1) % (1 + m);
			int cnt = (j - 1 - r) / (m + 1) * 2 + 2;
			if (cnt < minCnt) {
				minCnt = cnt;
				minIdx = i;
			}
		}
		System.out.println(minIdx + " " + minCnt);
		br.close();
	}
}
