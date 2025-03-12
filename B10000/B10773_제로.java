import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// stack 사용하여 0이 들어오면 가장 최근에 들어온 값 제거(pop)
public class B10773_제로 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine()); // 정수 개수
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < K; i++) {
			int num = Integer.parseInt(br.readLine());
			if (num == 0) { // 0이면 가장 최근에 들어온 값 제거
				if (!stack.isEmpty()) {
					stack.pop();
				}
			} else { // 0이 아니면 stack에 값 넣기
				stack.push(num);
			}
		}
		int sum = 0; // 스택에 있는 값의 합
		for (Integer i : stack) {
			sum += i;
		} // 스택에 있는 값의 합 구하기
		System.out.println(sum);
		br.close();
	}
}
