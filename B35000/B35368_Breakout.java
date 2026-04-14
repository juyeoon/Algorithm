import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 35368 - Breakout
// https://www.acmicpc.net/problem/35368
public class B35368_Breakout {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] crate = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int r = Integer.parseInt(br.readLine());
            crate[r]++;
        }
        int clockwise = 0;
        for (int i = 1; i < x; i++) {
            clockwise += crate[i];
        }
        int counterClockwise = 0;
        for (int i = x; i <= n; i++) {
            counterClockwise += crate[i];
        }
        System.out.println(Math.min(clockwise, counterClockwise));
		br.close();
	}
}
