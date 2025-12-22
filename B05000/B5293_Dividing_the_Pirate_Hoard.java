import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/5293
public class B5293_Dividing_the_Pirate_Hoard {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		long M = Long.parseLong(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		long[] t = new long[N];
		long p = M;
		for (int i = 0; i < N; i++) {
			long q = p / N;
			long r = p % N;
			t[i] = q + r;
			p = q * (N - 1);
		}
		Arrays.sort(t);
		for (int i = N - 1; i >= 0; i--) {
			sb.append(t[i]);
			if (i != 0) {
				sb.append(" ");
			}
		}
		sb.append("\n").append(p);
		System.out.println(sb);
		br.close();
	}
}
