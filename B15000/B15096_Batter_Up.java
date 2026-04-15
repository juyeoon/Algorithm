import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 15096 - Batter Up
// https://www.acmicpc.net/problem/15096
public class B15096_Batter_Up {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double sum = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            if (x != -1) {
                sum += x;
                cnt++;
            }
        }
        System.out.println(sum / cnt);
		br.close();
	}
}
