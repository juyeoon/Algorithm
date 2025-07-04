import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/24830
// 주어진 수식의 연산자에 맞게 새로운 계산식으로 계산
// a + b = (a + b) - (이전 계산 결과)
// a - b = (a - b) * (이전 계산 결과)
// a * b = (a * b) * (a * b)
// a / b = (a + 1) / 2
public class B24830_Broken_Calculator {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 명령의 개수
		long ans = 1; // 이전 계산 결과
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long a = Long.parseLong(st.nextToken()); // 피연산자 a
			char op = st.nextToken().charAt(0); // 연산자
			long b = Long.parseLong(st.nextToken()); // 피연산자 b
			switch (op) { // 연산자에 종류에 따라 계산
			case '+':
				ans = (a + b) - ans;
				break;
			case '-':
				ans = (a - b) * ans;
				break;
			case '*':
				ans = a * b * a * b;
				break;
			case '/':
				ans = (a + 1) / 2;
				break;
			}
			sb.append(ans).append("\n"); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
