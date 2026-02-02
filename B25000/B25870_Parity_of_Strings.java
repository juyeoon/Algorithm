import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25870 - Parity of Strings
// https://www.acmicpc.net/problem/25870
public class B25870_Parity_of_Strings {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int[] cnt = new int[26];
		for (int i = 0; i < s.length(); i++) {
			cnt[s.charAt(i) - 'a']++;
		}
		boolean allEven = true;
		boolean allOdd = true;
		for (int i = 0; i < 26; i++) {
			if (cnt[i] == 0) {
				continue;
			}
			if (cnt[i] % 2 == 0) {
				allOdd = false;
			} else {
				allEven = false;
			}
		}
		if (allEven) {
			System.out.println(0);
		} else if (allOdd) {
			System.out.println(1);
		} else {
			System.out.println(2);
		}
		br.close();
	}
}
