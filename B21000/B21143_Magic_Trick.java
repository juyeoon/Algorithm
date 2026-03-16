import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 21143 - Magic Trick
// https://www.acmicpc.net/problem/21143
public class B21143_Magic_Trick {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        boolean[] used = new boolean[26];
        int ans = 1;
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if (used[idx]) {
                ans = 0;
                break;
            }
            used[idx] = true;
        }
        System.out.println(ans);
		br.close();
	}
}
