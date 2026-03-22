import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 35213 - Jacobi Numbers
// https://www.acmicpc.net/problem/35213
public class B35213_Jacobi_Numbers {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		sb.append(n).append('\n');
		for (int i = 0; i < n; i++) {
			sb.append(1);
			if (i < n - 1) {
				sb.append(" ");
			}
		}
		System.out.println(sb);
		br.close();
	}
}
