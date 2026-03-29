import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 29190 - Стражи
// https://www.acmicpc.net/problem/29190
public class B29190_Стражи {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == x && j == y) {
                    continue;
                }
                int dist = Math.abs(i - x) + Math.abs(j - y);
                if (dist <= k) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
		br.close();
	}
}
