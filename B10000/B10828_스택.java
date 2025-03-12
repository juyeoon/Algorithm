import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

//Stack API 사용
public class B10828_스택 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 명령 개수
		Stack<Integer> stack = new Stack<>(); // 스택
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String cmd = st.nextToken();
			int temp = 0;
			if (cmd.equals("push")) {
				stack.push(Integer.parseInt(st.nextToken()));
				continue;
			} else if (cmd.equals("pop")) {
				temp = (stack.isEmpty()) ? -1 : stack.pop();
			} else if (cmd.equals("size")) {
				temp = stack.size();
			} else if (cmd.equals("empty")) {
				temp = (stack.isEmpty()) ? 1 : 0;
			} else if (cmd.equals("top")) {
				temp = (stack.isEmpty()) ? -1 : stack.peek();
			}
			sb.append(temp).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
