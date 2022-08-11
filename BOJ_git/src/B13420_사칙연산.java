import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 수가 int형을 넘어서는 것에 주의
public class B13420_사칙연산 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;

		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine(), " "); // 공백 단위로 끊기
			long a = Long.parseLong(st.nextToken()); // 연산자 앞 피연산자
			String o = st.nextToken(); // 연산자
			long b = Long.parseLong(st.nextToken()); // 연산자 뒤 피연산자
			st.nextToken();
			long c = Long.parseLong(st.nextToken()); // 결과
			long ans = 0; // 실제 연산 결과
			// 실제로 연산하기
			if (o.equals("+")) { // 더하기
				ans = a + b;
			} else if (o.equals("-")) { // 빼기
				ans = a - b;
			} else if (o.equals("*")) { // 곱하기
				ans = a * b;
			} else { // 나누기
				ans = a / b;
			}
			sb.append(ans == c ? "correct\n" : "wrong answer\n"); // 입력받은 결과와 실제 연산 결과 비교
		}
		System.out.println(sb); // 출력
		br.close();

	}
}