import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

// https://www.acmicpc.net/problem/31907
public class B31907_GIST_찍기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[][] c = new char[3][4];
		for (char[] ds : c) {
			Arrays.fill(ds, '.');
		}
		c[0][0] = 'G';
		c[1][1] = 'I';
		c[1][3] = 'T';
		c[2][2] = 'S';
		int N = Integer.parseInt(br.readLine());
		ArrayList<StringBuilder> line = new ArrayList<>();
		line.add(new StringBuilder());
		line.add(new StringBuilder());
		line.add(new StringBuilder());
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < N; j++) {
				line.get(0).append(c[0][i]);
				line.get(1).append(c[1][i]);
				line.get(2).append(c[2][i]);
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < N; j++) {
				sb.append(line.get(i).toString()).append("\n");
			}
		}
		System.out.println(sb);
		br.close();
	}
}
