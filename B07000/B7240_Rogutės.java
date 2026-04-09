import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 7240 - Rogutės
// https://www.acmicpc.net/problem/7240
public class B7240_Rogutės {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
        int speed = 0;
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            speed += a;
            if (i != N - 1 && speed > S) {
                speed--;
            }
        }
        System.out.println(speed);
		br.close();
	}
}
