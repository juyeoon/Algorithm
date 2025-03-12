import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//Stack 사용 - 피연산자: push, 연산자: pop 2번 후 연산 후 결과 push
public class B1935_후위_표기식2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 피연산자 개수
		String str = br.readLine(); // 연산 식
		Stack<Double> stack = new Stack<>(); // 피연산자 push
		int[] value = new int[N]; // 피연산자 값 매핑(A: value[0], B: value[1], ...)
		for (int i = 0; i < N; i++) {
			value[i] = Integer.parseInt(br.readLine());
		} // input
		for (int i = 0; i < str.length(); i++) { // 연산
			char c = str.charAt(i); // 피연산자 or 연산자
			if (c >= 65) { // 피연산자
				stack.push((double) value[c - 65]); // push value[매핑값]
			} else { // 연산자
				double b = stack.pop(); // 피연산자 2
				double a = stack.pop(); // 피연산자 1
				if (c == '+')
					stack.push(a + b); // +
				else if (c == '-')
					stack.push(a - b); // -
				else if (c == '*')
					stack.push(a * b); // *
				else if (c == '/')
					stack.push(a / b); // /
			}
		}
		System.out.printf("%.2f", stack.pop()); // 마지막 값이 연산 결과. 소수점 2자리까지
		br.close();
	}
}