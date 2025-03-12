import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// 수가 큰 곱셈, 자리 수의 최댓값이 50000이기 때문에 BigInteger 사용
public class B22193_Multiply {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine(); // 수의 길이 필요 없음
		BigInteger A = new BigInteger(br.readLine()); // 수 A
		BigInteger B = new BigInteger(br.readLine()); // 수 B
		System.out.println(A.multiply(B)); // A * B
		br.close();
	}
}
