import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

//우선순위 큐 사용 //1616ms 207300KB
public class B2751_수_정렬하기2_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < N; i++) {
			pq.add(Integer.parseInt(br.readLine()));
		} // input
		for (int i = 0; i < N; i++) {
			sb.append(pq.poll()).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
