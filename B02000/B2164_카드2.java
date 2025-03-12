import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 큐 사용 - 삭제, 넘기기 반복
public class B2164_카드2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			queue.offer(i);
		} // input
		while (queue.size() > 1) {
			queue.poll(); // 삭제
			queue.add(queue.poll()); // 넘기기
		}
		System.out.println(queue.peek());
		sc.close();
	}
}
