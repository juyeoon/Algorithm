import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/17869
// S(k) = (k가 짝수면 k/2, 홀수면 (k+1))
public class B17869_Simple_Collatz_Sequence {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		int cnt = 0; // 1이 되기까지의 횟수
		while (n != 1) {
			if (n % 2 == 0) { // 짝수
				n /= 2;
			} else { // 홀수
				n += 1;
			}
			cnt++;
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}
