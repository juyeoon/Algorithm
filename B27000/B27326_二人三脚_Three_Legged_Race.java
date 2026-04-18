import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 27326 - 二人三脚 (Three-Legged Race)
// https://www.acmicpc.net/problem/27326
public class B27326_二人三脚_Three_Legged_Race {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
        int[] cnt = new int[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 2 * N - 1; i++) {
            int team = Integer.parseInt(st.nextToken());
            cnt[team]++;
        }
        for (int i = 1; i <= N; i++) {
            if (cnt[i] == 1) {
                System.out.println(i);
                return;
            }
        }
		br.close();
	}
}
