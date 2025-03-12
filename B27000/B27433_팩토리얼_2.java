import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// for문을 이용하여 N까지 반복하여 곱하기(단순 구현)
public class B27433_팩토리얼_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long ans = 1;
		for (int i = 1; i <= N; i++) {
			ans *= i;
		}
		System.out.println(ans);
		br.close();
	}
}