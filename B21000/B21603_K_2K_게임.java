import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/21603
public class B21603_K_2K_게임 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int a = K % 10;
		int b = (2 * K) % 10;
		int cnt = 0;
		for (int i = 1; i <= N; i++) {
			int d = i % 10;
			if (d != a && d != b) {
				cnt++;
				sb.append(i).append(" ");
			}
		}
		System.out.println(cnt);
		if (cnt != 0) {
			System.out.println(sb);
		}
		br.close();
	}
}
