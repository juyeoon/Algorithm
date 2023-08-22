import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10!이 6주이므로 11!부터 N!은 6 * 11 * ... * N
public class B28352_10팩 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int ans = 6; // 출력값
		for (int i = 11; i <= N; i++) { // 11부터 N까지 ans에 곱하기
			ans *= i;
		}
		System.out.println(ans); // 출력
		br.close();
	}
}