import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

//BigInteger 사용
public class B2338_긴자리_계산 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger A = new BigInteger(br.readLine());
		BigInteger B = new BigInteger(br.readLine());
		System.out.println(A.add(B)); // A+B
		System.out.println(A.subtract(B)); // A-B
		System.out.println(A.multiply(B)); // A*B
		br.close();
	}
}
