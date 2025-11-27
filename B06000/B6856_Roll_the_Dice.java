import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/6856
public class B6856_Roll_the_Dice {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		for (int i = 1; i <= m; i++) {
			int j = 10 - i;
			if (j >= 1 && j <= n) {
				cnt++;
			}
		}
		if (cnt == 1) {
			System.out.println("There is 1 way to get the sum 10.");
		} else {
			System.out.println("There are " + cnt + " ways to get the sum 10.");
		}
		br.close();
	}
}
