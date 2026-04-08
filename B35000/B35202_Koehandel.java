import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 35202 - Koehandel
// https://www.acmicpc.net/problem/35202
public class B35202_Koehandel {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long c = Long.parseLong(st.nextToken());
		long n = Long.parseLong(st.nextToken());
		if (n > c) {
			System.out.println(c + 1);
		} else if (n == c) {
			System.out.println(c);
		} else {
			System.out.println(0);
		}
		br.close();
	}
}
