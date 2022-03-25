import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B1874_스택_수열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int cnt = 1; // 스택에 넣을 숫자(오름차순)
		boolean no = false; // 가능한지 안한지 체크 // true: 불가능, false: 가능
		Stack<Integer> stack = new Stack<>();
		Loop: for (int i = 0; i < n; i++) { // n번 반복(n번 읽기)
			int num = Integer.parseInt(br.readLine()); // 출력 원하는 숫자
			while (cnt <= n + 1) {
				if (!stack.isEmpty() && stack.peek() == num) { // 스택에 숫자가 있고 제일 위가 원하는 숫자일때
					stack.pop();
					sb.append("-\n");
					break;
				} else if (cnt > n) { // cnt가 n보다 크면 불가능이 됨
					no = true;
					break Loop; // 전체 반복문 탈출(더이상 할 필요 X)
				} else { // 나머지 경우에는 push
					stack.push(cnt++);
					sb.append("+\n");
				}
			}
		}
		if (no) { // 불가능하면
			sb.setLength(0);
			sb.append("NO");
		}
		System.out.println(sb);
		br.close();
	}
}
