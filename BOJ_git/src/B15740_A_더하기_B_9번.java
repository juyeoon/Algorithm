import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

//BigInteger 사용
public class B15740_A_더하기_B_9번 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		BigInteger A = new BigInteger(s[0]);
		BigInteger B = new BigInteger(s[1]);
		System.out.println(A.add(B));
	}
}
