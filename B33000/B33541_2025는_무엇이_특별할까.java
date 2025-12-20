import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/33541
public class B33541_2025는_무엇이_특별할까 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int ans = -1;
		for (int i = X + 1; i <= 9999; i++) {
			int a = i / 100;
			int b = i % 100;
			int sum = a + b;
			if (sum * sum == i) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
		br.close();
	}
}
