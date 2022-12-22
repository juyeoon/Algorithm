import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// 주어지는 정수는 Long 범위 이내
// 전체 합은 Long 범위를 넘을 수 있기 때문에 합은 BigInteger 사용

// BigInteger 생성 시 () 안이 String이면 값을 문자열로 넘겨줄 수 있음
// BigInteger 생성 시 valueOf를 사용할 시 값을 숫자로 넘겨줄 수 있음
// 계산 시 값을 숫자로 넘겨주면 연산 시간을 줄일 수 있음
public class B1247_부호 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for (int tc = 0; tc < 3; tc++) { // 3개의 테스트케이스 
			int N = Integer.parseInt(br.readLine()); // 하나의 테스트케이스 안의 정수 개수
			BigInteger sum = BigInteger.ZERO; // 합
			for (int i = 0; i < N; i++) {
//				sum = sum.add(new BigInteger(br.readLine())); // BigInteger 값을 String으로 넘김
				sum = sum.add(BigInteger.valueOf(Long.parseLong(br.readLine()))); // BigInteger 값을 Long으로 넘김
			}
			int cp = sum.compareTo(BigInteger.ZERO); // 0과 합을 비교한 결과 (0: 같음, 1: 파라미터 보다 큰 수, 2: 파라미터 보다 작은 수)
			if (cp == 0) { // 같음
				sb.append("0\n");
			} else if (cp == 1) { // 양수
				sb.append("+\n");
			} else { // 음수
				sb.append("-\n");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}