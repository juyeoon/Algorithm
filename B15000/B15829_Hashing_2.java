import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// BigInteger을 사용하지 않는 예제
// R % M 전에 R * 31에서 int를 넘기 때문에 R은 long이어야 한다. 
public class B15829_Hashing_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine()); // 문자열 길이
		int M = 1234567891; // 적당히 큰 수(문제에 주어짐)
		long R = 1; // 고유 계수
		String str = br.readLine(); // 문자열
		long sum = 0; // 수열의 값의 합
		for (int i = 0; i < L; i++) {
			int a = str.charAt(i) - 'a' + 1; // 문자 -> 숫자
			sum += a * R; // 수열의 값 계산
			R = (R * 31) % M; // 합을 %M하나, 합하기 전에 %M을 하나 결과에는 영향이 없기 때문
		}
		sum %= M; // 나머지 계산 한 번 더
		System.out.println(sum);
		br.close();
	}
}
