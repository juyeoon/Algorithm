import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// 입력 범위 때문에 BigInteger 사용 
// 이진수 -> 10진수로 변환 -> 곱하기 17 -> 이진수로 변환 -> 출력
public class B5893_17배 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger N = new BigInteger(br.readLine(), 2); // 입력값 이진수 -> 10진수
		N = N.multiply(new BigInteger("17")); // 곱하기 17
		System.out.println(N.toString(2)); // 10진수 -> 이진수 출력
		br.close();
	}
}
