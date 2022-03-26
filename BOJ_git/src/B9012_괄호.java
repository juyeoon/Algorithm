import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// stack을 이용
// '(' => push, ')' => pop
public class B9012_괄호 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		Loop: for (int i = 0; i < T; i++) {
			Stack<Boolean> stack = new Stack<>(); // 크기를 줄이기 위해 Boolean 사용 (뭐라도 넣으면 됨)
			char[] c = br.readLine().toCharArray(); // 괄호 문자열
			for (int j = 0; j < c.length; j++) {
				if (c[j] == '(') { // '(' => push
					stack.push(true);
				} else if (c[j] == ')') { // ')' => pop
					if (stack.isEmpty()) { // pop 전 스택이 비었으면 괄호 쌍 안 맞음
						sb.append("NO\n");
						continue Loop; // 다음 테스트케이스로
					}
					stack.pop();
				}
			}
			sb.append(stack.isEmpty() ? "YES\n" : "NO\n"); // 마지막에 비었으면 괄호 쌍 맞음 아니면 안 맞음
		}
		System.out.println(sb);
		br.close();
	}
}
