import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1부터 N까지 세제곱의 합을 구하는 문제
public class B20833_Kuber {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int ans = 0; // 합(출력)
		for (int i = 1; i <= N; i++) { // 1부터 N까지 세제곱의 합 구하기
			ans += i * i * i;
		}
		System.out.println(ans); // 출력
		br.close();
	}
}