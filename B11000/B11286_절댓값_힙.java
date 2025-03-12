import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// Comparator의 compare() 함수를 오버라이딩 
// 절댓값이 같지 않으면 절댓값 비교. 절댓값이 같으면 원래 값 비교하여 최소힙 구현
// 0이 입력되면 i) 큐가 비었을 때 0 출력. ii) 큐가 비지 않았을 때 힙.poll() 출력.
// 0이 아닌 값이 입력되면 힙.offer(입력값)
public class B11286_절댓값_힙 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 연산 개수
		// 절댓값 최소힙 구현
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				int abso1 = Math.abs(o1);
				int abso2 = Math.abs(o2);
				if (abso1 == abso2) {
					return (o1 - o2 > 0 ? 1 : -1);
				} else {
					return abso1 - abso2;
				}
			}
		});
		for (int i = 0; i < N; i++) { // 연산
			int input = Integer.parseInt(br.readLine()); // 입력값
			if (input == 0) { // 빼기 연산
				if (minHeap.isEmpty()) { // 큐가 비었을 때
					sb.append("0\n");
				} else { // 큐가 비지 않았을 때
					sb.append(minHeap.poll()).append("\n");
				}
			} else { // 더하기 연산
				minHeap.offer(input);
			}
		}
		bw.write(sb.toString()); // 출력
		bw.flush();
		bw.close();
		br.close();
	}
}