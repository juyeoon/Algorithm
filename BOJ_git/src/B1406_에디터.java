import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

// 1406 - 에디터 
// LinkedList 시간 초과 -> 커서 기준 좌스택 우스택 둬야함
public class B1406_에디터 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		String s = br.readLine(); // 문자열
		int N = Integer.parseInt(br.readLine()); // 명령 개수
		Stack<Character> left = new Stack<>(); // 커서 기준 왼쪽
		Stack<Character> right = new Stack<>(); // 커서 기준 오른쪽
		for (int i = 0; i < s.length(); i++) {
			left.push(s.charAt(i));
		} // 초기 문자열 설정 -> 전부 왼쪽 스택
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String cmd = st.nextToken();
			if (cmd.equals("L")) { // 커서 왼쪽 이동
				if (!left.isEmpty()) {
					right.push(left.pop()); // 왼쪽 젤 위를 오른쪽으로 
				}
			} else if (cmd.equals("D")) { // 커서 오른쪽 이동
				if (!right.isEmpty()) {
					left.push(right.pop()); // 오른쪽 젤 위를 왼쪽으로
				}
			} else if (cmd.equals("B")) { // 커서 앞 삭제
				if (!left.isEmpty()) {
					left.pop();
				}
			} else { // 커서 앞 문자 삽입
				left.push(st.nextToken().charAt(0));
			}
		}
		// 출력
		for (Character c : left) { // 스택 아래(peek)부터 위
			sb.append(c);
		}
		while (!right.isEmpty()) { // 스택 위(peek)부터 아래
			sb.append(right.pop());
		}
		System.out.println(sb);
		br.close();
	}
}
