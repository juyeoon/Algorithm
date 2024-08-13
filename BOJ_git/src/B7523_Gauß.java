import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

// n부터 m까지의 합 = (첫번째 수 + 마지막 수) * (수의 개수) / 2
// = (n+m) * (m-n+1) / 2
// 수의 범위 때문에 BigInteger로 계산 필요
public class B7523_Gauß {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 1; tc <= T; tc++) {
			sb.append("Scenario #").append(tc).append(":\n"); // 출력 형식 맞추기
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()); // 첫번째 값
			int m = Integer.parseInt(st.nextToken()); // 마지막 값
			BigInteger ans = BigInteger.valueOf((n + m)).multiply(BigInteger.valueOf((m - n + 1)))
					.divide(BigInteger.valueOf(2)); // n부터 m까지의 합
			sb.append(ans).append("\n\n"); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
