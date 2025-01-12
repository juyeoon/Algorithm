import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/17466
// N!을 P로 나눈 값을 구하는 문제
// 모두 곱한 값의 나머지는 곱해지는 값의 나머지의 곱과 같음
// P가 N보다 크기 때문에 새롭게 곱해지는 값 자체는 P로 나눌 필요가 없음. 새롭게 곱해진 값만 P로 나누면 됨
public class B17466_N_mod_P_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long N = Long.parseLong(st.nextToken()); // N!
		long P = Long.parseLong(st.nextToken()); // P (나누는 값 값)
		long ans = 1; // 출력값
		for (int i = 2; i <= N; i++) { // 2부터 N까지 곱할 때마다 나머지값 구하기
			ans *= i;
			ans %= P;
		}
		System.out.println(ans); // 출력
		br.close();
	}
}
