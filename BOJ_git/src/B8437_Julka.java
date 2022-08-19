import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
// Claudia의 사과 개수 = (모든 사과의 수 - Klaudia가 가지고 있는 사과의 수) / 2 + D
// Natalia의 사과 개수 = (모든 사과의 수 - Klaudia가 가지고 있는 사과의 수) / 2
public class B8437_Julka {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger S = new BigInteger(br.readLine());
		BigInteger D = new BigInteger(br.readLine());
		BigInteger x = (S.subtract(D)).divide(new BigInteger("2"));
		System.out.println(x.add(D) + "\n" + x); // Claudia 사과 개수, Natalia 사과 개수 출력
		br.close();
	}
}
