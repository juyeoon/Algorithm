import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// 사탕의 합이 long의 범위를 넘을 수 있으므로 BigInteger를 이용하여 계산
public class B2547_사탕_선생_고창영 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			br.readLine();
			int N = Integer.parseInt(br.readLine()); // 학생 수
			BigInteger sum = BigInteger.ZERO; // 사탕 합
			for (int i = 0; i < N; i++) {
				sum = sum.add(new BigInteger(br.readLine())); // 사탕 합 구하기
			}
			if (sum.remainder(BigInteger.valueOf(N)).compareTo(BigInteger.ZERO) == 0) { // 사탕 합이 학생수로 나누어 떨어지면
				sb.append("YES\n"); // 공평하게 나누어 줄 수 있음
			} else { // 아니면
				sb.append("NO\n"); // 공평하게 나누어 줄 수 없음
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}