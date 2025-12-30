import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 34935 - 오름차순과 비내림차순
// https://www.acmicpc.net/problem/34935
public class B34935_오름차순과_비내림차순 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		long prev = Long.parseLong(st.nextToken());
		int ans = 1;
		for (int i = 1; i < N; i++) {
			long cur = Long.parseLong(st.nextToken());
			if (cur <= prev) {
				ans = 0;
				break;
			}
			prev = cur;
		}
		System.out.println(ans);
		br.close();
	}
}
