import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

// https://www.acmicpc.net/problem/2052
// BigDecimal 클래스를 사용하여 정밀한 소수 연산
public class B2052_지수연산 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 정수 N
		BigDecimal two = new BigDecimal("2");
		BigDecimal power = two.pow(N); // 2^N
		BigDecimal result = BigDecimal.ONE.divide(power, N + 10, RoundingMode.HALF_UP); // 1 / 2^N
		result = result.stripTrailingZeros(); // 불필요한 0 제거
		System.out.println(result.toPlainString()); // 일반 소수 형태로 출력
	}
}
