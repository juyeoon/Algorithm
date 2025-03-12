import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//np 사용
public class B11050_이항_계수1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int K = Integer.parseInt(s[1]);
		// NCK
		byte p[] = new byte[N];
		for (int i = 0; i < K; i++) {
			p[N - 1 - i] = 1;
		}
		int ans = 0;
		do {
			ans++;
		} while (np(p));
		System.out.println(ans);
		br.close();
	}

	public static boolean np(byte p[]) {
		int N = p.length;
		int i = N - 1;
		while (i > 0 && p[i - 1] >= p[i]) {
			i--;
		}
		if (i == 0) {
			return false;
		}
		int j = N - 1;
		while (p[i - 1] >= p[j]) {
			j--;
		}
		swap(p, i - 1, j);
		int k = N - 1;
		while (i < k) {
			swap(p, i++, k--);
		}
		return true;
	}

	public static void swap(byte[] p, int i, int j) {
		byte temp = p[i];
		p[i] = p[j];
		p[j] = temp;
	}
}
