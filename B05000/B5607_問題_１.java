import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 5607 - 問題 １
// https://www.acmicpc.net/problem/5607
public class B5607_問題_１ {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int scoreA = 0;
        int scoreB = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a > b) {
                scoreA += a + b;
            } else if (a < b) {
                scoreB += a + b;
            } else {
                scoreA += a;
                scoreB += b;
            }
        }
        System.out.println(scoreA + " " + scoreB);
		br.close();
	}
}
