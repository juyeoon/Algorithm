import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// x= b*c/a
// 10의 100제곱이기 때문에 BigInteger 사용
public class B24309_РАВЕНСТВО {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger a = new BigInteger(br.readLine());
		BigInteger b = new BigInteger(br.readLine());
		BigInteger c = new BigInteger(br.readLine());
		System.out.println(b.subtract(c).divide(a));
		br.close();
	}
}
