import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// BigInteger의 메소드를 이용하여 이진수로 변환
public class B10829_이진수_변환 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger N = new BigInteger(br.readLine()); // 10진수
		System.out.println(N.toString(2)); // 2진수로 변환 후 출력
		br.close();
	}
}