import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 15238 - Pirates
// https://www.acmicpc.net/problem/15238
public class B15238_Pirates {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String s = br.readLine();
		int[] cnt = new int[26];
		for (int i = 0; i < s.length(); i++) {
			cnt[s.charAt(i) - 'a']++;
		}
		int maxCount = 0;
		char maxChar = 'a';
		for (int i = 0; i < 26; i++) {
			if (cnt[i] > maxCount) {
				maxCount = cnt[i];
				maxChar = (char) (i + 'a');
			}
		}
		System.out.println(maxChar + " " + maxCount);
	}
}
