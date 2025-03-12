import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 주어진 알고리즘은 순열(nP3)을 구하는 알고리즘
// 시간 복잡도는 O(n^3)
public class B24267_알고리즘_수업_알고리즘의_수행_시간_6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		long ans = n * (n - 1) * (n - 2) / 6; // nP3
		System.out.println(ans + "\n3"); // 출력
		br.close();
	}
}