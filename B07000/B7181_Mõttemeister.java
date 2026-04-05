import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 7181 - Mõttemeister
// https://www.acmicpc.net/problem/7181
public class B7181_Mõttemeister {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String secret = br.readLine();
        int n = Integer.parseInt(br.readLine());
        int[] secretCnt = new int[10];
        for (int i = 0; i < 4; i++) {
            secretCnt[secret.charAt(i) - '0']++;
        }
        for (int i = 0; i < n; i++) {
            String guess = br.readLine();
            int b = 0;
            int[] guessCnt = new int[10];
            for (int j = 0; j < 4; j++) {
                char s = secret.charAt(j);
                char g = guess.charAt(j);
                if (s == g) {
                    b++;
                }
                guessCnt[g - '0']++;
            }
            int a = 0;
            for (int j = 0; j < 10; j++) {
                a += Math.min(secretCnt[j], guessCnt[j]);
            }
            sb.append(a).append(" ").append(b).append("\n");
        }
        System.out.print(sb);
		br.close();
	}
}
