import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/16503
// 피연산자 2개, 연산자 1개로 연산하는 함수를 만든 다음 괄호 순서에 맞게 호출하여 결과 도출
public class B16503_괄호_없는_사칙연산 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int K1 = Integer.parseInt(st.nextToken()); // 피연산자 1
		char O1 = st.nextToken().charAt(0); // 연산자 1
		int K2 = Integer.parseInt(st.nextToken()); // 피연산자 2
		char O2 = st.nextToken().charAt(0); // 연산자 2
		int K3 = Integer.parseInt(st.nextToken()); // 피연산자 3
		int ans1 = calc(calc(K1, O1, K2), O2, K3); // (K1 O1 K2) O2 K3
		int ans2 = calc(K1, O1, calc(K2, O2, K3)); // K1 O1 (K2 O2 K3)
		sb.append(Math.min(ans1, ans2)).append("\n").append(Math.max(ans1, ans2)); // 최소 최대 출력
		System.out.println(sb);
		br.close();
	}

	public static int calc(int a, char c, int b) { // 계산
		int ret = 0; // 연산 결과
		if (c == '+') { // +
			ret = a + b;
		} else if (c == '-') { // -
			ret = a - b;
		} else if (c == '*') { // *
			ret = a * b;
		} else if (c == '/') { // /
			ret = a / b;
		}
		return ret;
	}
}