import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/20359
// 2로 나누어 떨어지지 않을 때까지 반복
public class B20359_A_simple_task {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		while (n % 2 == 0) {
			n /= 2;
			cnt++;
		}
		System.out.println(n + " " + cnt);
		br.close();
	}
}
