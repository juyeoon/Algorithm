import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// 2진수 -> 10진수 => new BigInteger(이진수, 2)
// 10진수 -> 2진수 => BigInteger.toString(2)
public class B1252_이진수_덧셈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		BigInteger A = new BigInteger(s[0], 2); // 첫번째 2진수 -> 10진수
		BigInteger B = new BigInteger(s[1], 2); // 두번째 2진수 -> 10진수
		BigInteger sum = A.add(B); // 더하기
		System.out.println(sum.toString(2)); // 10진수 -> 2진수
		br.close();
	}
}