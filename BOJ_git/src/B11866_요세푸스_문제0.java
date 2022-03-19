import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B11866_요세푸스_문제0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt(); // N명의 사람
		int K = sc.nextInt(); // K번째 사람 제거
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			queue.offer(i);
		} // 1~N까지 큐에 넣기
		sb.append("<"); // 출력 형식 맞추기
		while (!queue.isEmpty()) { // 큐가 빌때까지
			for (int i = 1; i < K; i++) { // K-1번 맨 앞의 사람을 큐의 맨 뒤로 보내기
				queue.add(queue.poll());
			}
			sb.append(queue.poll()).append(", "); // 맨 앞의 사람(K번째 사람) 제거
		}
		sb.setLength(sb.length() - 2); // 마지막이 ", "이므로 제거 후
		sb.append(">"); // 출력 형식 맞추기
		System.out.println(sb); // 출력
		sc.close();
	}
}
