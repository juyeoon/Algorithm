import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/4246
public class B4246_To_and_Fro {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("0")) {
			int N = Integer.parseInt(s);
			String encrypted = br.readLine();
			char[][] grid = new char[encrypted.length() / N][N];
			int idx = 0;
			for (int i = 0; i < grid.length; i++) {
				if (i % 2 == 0) {
					for (int j = 0; j < N; j++) {
						grid[i][j] = encrypted.charAt(idx++);
					}
				} else {
					for (int j = N - 1; j >= 0; j--) {
						grid[i][j] = encrypted.charAt(idx++);
					}
				}
			}
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < grid.length; j++) {
					sb.append(grid[j][i]);
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
