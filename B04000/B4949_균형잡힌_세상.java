import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 스택을 사용하여 괄호 짝 확인
public class B4949_균형잡힌_세상 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals(".")) { // . 이 오면 마지막 문장인 것
			boolean check = true; // 괄호가 짝이 맞는지 확인
			Stack<Character> stack = new Stack<>(); // 괄호 넣을 스택
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (c == '(' || c == '[') { // 여는 괄호면 push
					stack.push(c);
				} else if (c == ')') { // 닫는 괄호면 pop해서 비교
					if (stack.isEmpty()) { // 비어있으면 짝이 안 맞음
						check = false;
						break;
					} else if (stack.pop() != '(') { // '('가 아니면 짝이 안 맞음
						check = false;
						break;
					}
				} else if (c == ']') {
					if (stack.isEmpty()) { // 비어있으면 짝이 안 맞음
						check = false;
						break;
					} else if (stack.pop() != '[') { // '['가 아니면 짝이 안 맞음
						check = false;
						break;
					}
				}
			}
			// 문장을 다 돌았는데도 스택이 비어있지 않으면 짝이 안 맞음
			sb.append(check ? (stack.isEmpty() ? "yes\n" : "no\n") : "no\n");
		}
		System.out.println(sb);
		br.close();
	}
}
