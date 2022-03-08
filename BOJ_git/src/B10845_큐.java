import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B10845_큐 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 명령 개수
		Queue<Integer> queue = new LinkedList<>();
		int last = 0; // 마지막으로 offer된 값
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String cmd = st.nextToken(); // 명령
			int temp = 0; // sb에 추가할 값
			if (cmd.equals("push")) {
				last = Integer.parseInt(st.nextToken());
				queue.offer(last);
				continue;
			} else if (cmd.equals("pop")) {
				temp = queue.isEmpty() ? -1 : queue.poll();
			} else if (cmd.equals("size")) {
				temp = queue.size();
			} else if (cmd.equals("empty")) {
				temp = queue.isEmpty() ? 1 : 0;
			} else if (cmd.equals("front")) {
				temp = queue.isEmpty() ? -1 : queue.peek();
			} else if (cmd.equals("back")) {
				temp = queue.isEmpty() ? -1 : last;
			}
			sb.append(temp).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
