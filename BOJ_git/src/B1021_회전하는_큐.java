import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

// LinkedList로 덱(deque) 구현 
public class B1021_회전하는_큐 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 큐의 크기
		int M = Integer.parseInt(st.nextToken()); // 뽑아내려고 하는 수의 개수
		LinkedList<Integer> deque = new LinkedList<>(); // 큐
		for (int i = 1; i <= N; i++) { // input 큐
			deque.add(i);
		}
		int cnt = 0; // 최소 2번 연산 횟수 + 최소 3번 연산 횟수
		st = new StringTokenizer(br.readLine()); // 뽑아낼 수(의 위치)
		for (int i = 0; i < M; i++) { // 뽑을려는 수 만큼 반복
			int num = Integer.parseInt(st.nextToken()); // 뽑아낼 수(의 위치)
			int loc = deque.indexOf(num); // 뽑아낼 수의 큐안에서의 위치
			int midIdx = deque.size() / 2; // 큐의 가운데(홀수-가운데, 짝수-가운데 바로 뒤)
			if (loc > midIdx) { // 앞으로 넘김(3번 연산)
				for (int j = deque.size() - 1; j > loc; j--) { // 뽑아낼 수의 위치 전까지 앞으로 넘김
					cnt++;
					deque.addFirst(deque.pollLast());
				}
				cnt++; // 마지막 수(뽑을 수)를 앞으로 넘기는 횟수
				deque.pollLast(); // 뽑을 수 제거
			} else { // 뒤로 넘김(2번 연산)
				for (int j = 0; j < loc; j++) { // 뽑아낼 수의 위치 앞까지 뒤으로 넘김
					cnt++;
					deque.addLast(deque.pollFirst());
				}
				deque.pollFirst(); // 뽑을 수 제거
			}
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}
