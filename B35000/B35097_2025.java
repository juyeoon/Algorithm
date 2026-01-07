import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/35097
public class B35097_2025 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("0")) {
			int n = Integer.parseInt(s);
			int sum = 0;
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					sum += i * j;
				}
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
