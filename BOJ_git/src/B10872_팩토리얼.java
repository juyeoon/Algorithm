import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1부터 N까지 곱하기(반복문)
public class B10872_팩토리얼 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // N!
		int result = 1; // 결과
		for (int i = 2; i <= N; i++) {
			result *= i;
		}
		System.out.println(result);
	}
}
