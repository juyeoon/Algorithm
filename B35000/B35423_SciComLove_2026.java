import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 35423 - SciComLove (2026)
// https://www.acmicpc.net/problem/35423
public class B35423_SciComLove_2026 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
        int[] cnt = new int[128];
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i)]++;
        }
        int x = cnt['S']; // SciCom 개수
        int y = cnt['L']; // Love 개수
        for (int i = 0; i < x; i++) {
            sb.append("SciCom");
        }
        for (int i = 0; i < y; i++) {
            sb.append("Love");
        }
        System.out.println(sb);
		br.close();
	}
}
