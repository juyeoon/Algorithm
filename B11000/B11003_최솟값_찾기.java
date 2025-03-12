import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

// 슬라이딩 윈도우 사용
// https://bouncy-freedom-637.notion.site/11003-e25bf8d6db5947fabccbc99617e4cddb?pvs=4
public class B11003_최솟값_찾기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken()); // 수 개수
		int L = Integer.parseInt(st.nextToken()); // 최솟값을 구할 범위 크기

		st = new StringTokenizer(br.readLine(), " ");
		Deque<int[]> deque = new ArrayDeque<>(); // 최솟값을 구할 때 사용하는 덱

		for (int i = 1; i <= N; i++) { // 수 개수만큼 반복(인덱스)
			int tmp = Integer.parseInt(st.nextToken()); // 현재 값
			// 새로운 값 넣기
			while (!deque.isEmpty() && deque.peekLast()[1] >= tmp) {
				deque.pollLast();
			}
			deque.addLast(new int[] { i, tmp });
			// 빠지는 값 빼기
			if (deque.peekFirst()[0] == i - L) {
				deque.pollFirst();
			}
			bw.write(deque.peekFirst()[1] + " "); // 출력
		}
		bw.flush();
		bw.close();
		br.close();
	}
}