import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 35367 - Snakey String
// https://www.acmicpc.net/problem/35367
public class B35367_Snakey_String {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		char[][] grid = new char[r][c];
		for (int i = 0; i < r; i++) {
			grid[i] = br.readLine().toCharArray();
		}
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < r; j++) {
				if (grid[j][i] != '.') {
					sb.append(grid[j][i]);
					break;
				}
			}
		}
		System.out.println(sb);
		br.close();
	}
}
