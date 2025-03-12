import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// C(n)이 1이 될 때까지 점화식을 반복(단순 구현)
public class B14920_3n_plus_1_수열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c1 = Integer.parseInt(br.readLine()); // C(1)
		int cnt = 0; // n(반복 횟수)
		while (c1 != 1) { // 1이 되면 반복 종료
			c1 = (c1 % 2 == 0) ? c1 / 2 : 3 * c1 + 1; // C(1)이 짝수와 홀수에 따라 C(n)값 변경
			cnt++; // 횟수 갱신
		}
		System.out.println(++cnt); // 출력
		br.readLine();
	}
}