import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// BigInteger 사용하면 100점(long으로는 부족함)
public class B15829_Hashing {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine()); // 문자열 길이
		String str = br.readLine(); // 문자열
		BigInteger R = BigInteger.ONE; // 고유 계수
		BigInteger sum = BigInteger.ZERO; // 수열의 값의 합
		for (int i = 0; i < L; i++) {
			BigInteger a = BigInteger.valueOf(str.charAt(i) - 'a' + 1); // 문자 -> 숫자
			sum = sum.add(R.multiply(a)); // 수열의 값 계산
			R = R.multiply(BigInteger.valueOf(31)); // 다음 항 고유 계수 계산
		}
		sum = sum.mod(BigInteger.valueOf(1234567891)); // 나머지 계산
		System.out.println(sum);
		br.close();
	}
}
