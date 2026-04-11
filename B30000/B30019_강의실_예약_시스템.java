import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 30019 - 강의실 예약 시스템
// https://www.acmicpc.net/problem/30019
public class B30019_강의실_예약_시스템 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] lastEnd = new int[N + 1];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			if (lastEnd[k] <= s) {
				sb.append("YES");
				lastEnd[k] = e;
			} else {
				sb.append("NO");
			}
			sb.append("\n");
		}
		System.out.print(sb);
		br.close();
	}
}
