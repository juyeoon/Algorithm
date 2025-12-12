import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 16103 - Drawn and Quartered
// https://www.acmicpc.net/problem/16103
public class B16103_Drawn_and_Quartered {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		long K = Long.parseLong(st.nextToken());
		String s = br.readLine();
		int q = N / 4;
		int[] base = new int[N];
		for (int i = 0; i < q; i++) {
			base[i] = i;
		}
		for (int i = q; i < 2 * q; i++) {
			base[i] = 3 * q + (i - q);
		}
		for (int i = 2 * q; i < N; i++) {
			base[i] = q + (i - 2 * q);
		}
		int[] res = new int[N];
		for (int i = 0; i < N; i++) {
			res[i] = i;
		}
		while (K > 0) {
			if ((K & 1L) == 1L) {
				res = compose(base, res);
			}
			base = compose(base, base);
			K >>= 1;
		}
		for (int i = 0; i < N; i++) {
			sb.append(s.charAt(res[i]));
		}
		System.out.print(sb);
		br.close();
	}

	static int[] compose(int[] g, int[] f) {
		int n = f.length;
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = g[f[i]];
		}
		return h;
	}
}
