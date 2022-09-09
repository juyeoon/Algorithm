import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2진수 -> 10진수 -> 곱셈 -> 2진수
public class B14623_감정이입 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long B1 = Long.parseLong(br.readLine(), 2); // 2진수를 10진수로 변환하여 저장
		long B2 = Long.parseLong(br.readLine(), 2); // 2진수를 10진수로 변환하여 저장
		System.out.println(Long.toBinaryString(B1 * B2)); // 10진수를 곱한 후 2진수로 변환
		br.close();
	}
}
