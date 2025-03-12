import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 배열에 바구니 번호를 저장한 후
// 횟수마다 기준에서 끝 번호까지를 먼저 큐에 저장한 후 처음 번호부터 기준 앞까지의 번호를 저장한 후
// 처음 번호부터 끝 번호의 자리에 큐에서 하나씩 뺀 후 넣기
public class B10812_바구니_순서_바꾸기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 바구니 개수
		int M = Integer.parseInt(st.nextToken()); // 회전 횟수
		Queue<Integer> tmpQueue = new LinkedList<>(); // 회전된 바구니 저장
		int basket[] = new int[N + 1]; // 바구니 배열
		for (int i = 1; i <= N; i++) { // input basket[]
			basket[i] = i;
		}
		for (int tc = 0; tc < M; tc++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken()); // 처음 번호
			int j = Integer.parseInt(st.nextToken()); // 끝 번호
			int k = Integer.parseInt(st.nextToken()); // 기준 번호
			for (int l = k; l <= j; l++) { // 기준 번호 ~ 끝 번호 큐에 저장
				tmpQueue.add(basket[l]);
			}
			for (int l = i; l < k; l++) { // 처음 번호 ~ 기준 번호 큐에 저장
				tmpQueue.add(basket[l]);
			}
			for (int l = i; l <= j; l++) { // 회전한 바구니 배열에 다시 넣기
				basket[l] = tmpQueue.poll();
			}
		}
		for (int i = 1; i <= N; i++) { // 배열 출력
			sb.append(basket[i]).append(" ");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}