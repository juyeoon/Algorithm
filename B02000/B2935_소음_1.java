import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// 1. BigInteger 사용 (길이가 100까지 10의 제곱수)
// 두 수를 BigInteger로 받아 연산자가 +이면 add(), *이면 multiply() 사용
public class B2935_소음_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger A = new BigInteger(br.readLine()); // 피연산자 A
		char operator = br.readLine().charAt(0); // 연산자 
		BigInteger B = new BigInteger(br.readLine()); // 피연산자 B
		System.out.println((operator == '+') ? A.add(B) : A.multiply(B)); // 연산자가 +이면 add(), *이면 multiply() 연산 결과 출력
		br.close();
	}
}