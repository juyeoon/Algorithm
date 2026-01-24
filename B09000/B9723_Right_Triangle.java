import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 9723 - Right Triangle
// https://www.acmicpc.net/problem/9723
public class B9723_Right_Triangle {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] sides = new int[3];
			sides[0] = Integer.parseInt(st.nextToken());
			sides[1] = Integer.parseInt(st.nextToken());
			sides[2] = Integer.parseInt(st.nextToken());
			Arrays.sort(sides);
			int a = sides[0];
			int b = sides[1];
			int c = sides[2];
			boolean triangle = (a * a + b * b == c * c);
			sb.append("Case #").append(tc).append(": ").append(triangle ? "YES" : "NO").append('\n');
		}
		System.out.println(sb);
		br.close();
	}
}
