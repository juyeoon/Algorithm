import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B23037_5의_수난 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] n = br.readLine().toCharArray(); // 다섯 자리 수의 각 자리 숫자
		int sum = 0; // 각 자릿수의 다섯 제곱의 합
		for (int i = 0; i < 5; i++) { // 자릿수만큼 반복
			int v = (int) n[i] - '0'; // char -> int
			int v2 = v * v; // 제곱값
			sum += v2 * v2 * v; // 다섯 제곱값 더하기
		}
		System.out.println(sum); // 합 출력
		br.close();
	}
}
