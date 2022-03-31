import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 665부터 1 증가(브루트포스)
// 각 자리수가 연속해서 6이 3번 이상 나오면 true
// 11544KB 124ms
public class B1436_영화감독_숌_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 편 수
		int ans = 666;
		int cnt = 1;
		while (cnt < N) {
			if (check(++ans)) cnt++;
		}
		System.out.println(ans);
		br.close();
	}

	// 666이 들어가는지 확인
	public static boolean check(int num) {
		int cnt = 0;
		while (num > 0) {
			// 1의 자리수가 6인지 확인
			cnt = (num % 10 == 6) ? cnt + 1 : 0;
			if (cnt >= 3)  return true;
			num /= 10; // 자리수 변경
		}
		return false;
	}
}
