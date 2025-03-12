import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

// Deque(ArrayDeque) 라이브러리 사용
public class B10866_덱 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 명령 개수
		Deque<Integer> deque = new ArrayDeque<>();
		for (int i = 0; i < N; i++) {
			String s[] = br.readLine().split(" ");
			int temp = -2;
			if (s[0].equals("push_front")) {
				deque.offerFirst(Integer.parseInt(s[1]));
				continue;
			} else if (s[0].equals("push_back")) {
				deque.offerLast(Integer.parseInt(s[1]));
				continue;
			} else if (s[0].equals("pop_front")) {
				temp = deque.isEmpty() ? -1 : deque.pollFirst();
			} else if (s[0].equals("pop_back")) {
				temp = deque.isEmpty() ? -1 : deque.pollLast();
			} else if (s[0].equals("size")) {
				temp = deque.size();
			} else if (s[0].equals("empty")) {
				temp = deque.isEmpty() ? 1 : 0;
			} else if (s[0].equals("front")) {
				temp = deque.isEmpty() ? -1 : deque.peekFirst();
			} else { // "back"
				temp = deque.isEmpty() ? -1 : deque.peekLast();
			}
			sb.append(temp).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
