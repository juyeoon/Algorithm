import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 6190 - Another Cow Number Game
// https://www.acmicpc.net/problem/6190
public class B6190_Another_Cow_Number_Game {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		int score = 0;
		while (n != 1) {
			if (n % 2 == 0) {
				n /= 2;
			} else {
				n = 3 * n + 1;
			}
			score++;
		}
		System.out.println(score);
		br.close();
	}
}
