import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// BigInteger의 변환 제공 메서드을 사용하여 변환
public class B2998_8진수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger N = new BigInteger(br.readLine(), 2); // 2진수 입력
		System.out.println(N.toString(8)); // 8진수 출력
		br.close();
	}
}