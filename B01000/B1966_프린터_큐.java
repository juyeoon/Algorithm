import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//Queue를 이용하여 구현
public class B1966_프린터_큐 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); // 문서개수
			int M = Integer.parseInt(st.nextToken()); // 확인할 문서 위치
			Queue<Integer> queue = new LinkedList<>(); // 문서 큐
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				queue.offer(Integer.parseInt(st.nextToken()));
			} // input
			int idx = M; // 확인할 문서의 현재 위치
			int cnt = 0; // 출력한 문서 개수(확인할 문서의 순서)
			while (!queue.isEmpty()) { // 큐가 빌때까지
				int now = queue.poll(); // 가장 앞의 문서의 중요도(큐에서 제거)
				Iterator iterator = queue.iterator();
				int num = 0; // 큐에 있는 값 중에 가장 큰 값
				while (iterator.hasNext()) {
					num = Math.max((int) iterator.next(), num);
				} // num 설정
				if (idx != 0 && num > now) { // 현재 문서가 확인할 문서가 아니고, 현재 문서의 중요도보다 큰 값이 있을 때
					queue.offer(now); // 맨 뒤에 현재 문서를 넣음
					idx--; // idx를 -1 (앞으로 이동)
				} else if (idx == 0 && num > now) { // 현재 문서가 확인할 문서이고, 현재 문서의 중요도보다 큰 값이 있을 때
					queue.offer(now); // 맨 뒤에 현재 문서를 넣음
					idx = queue.size() - 1; // idx를 마지막 인덱스 번호로 바꿔줌
				} else if (idx != 0 && num <= now) { // 현재 문서가 확인할 문서가 아니고, 현재 문서의 중요도보다 큰 값이 없을 때
					cnt++; // 출력한 문서 개수 +1
					idx--; // idx를 -1 (앞으로 이동)
				} else{ // 현재 문서가 확인할 문서이고, 현재 문서의 중요도보다 큰 값이 없을 때
					sb.append(++cnt).append("\n"); // 이때까지 출력한 문서 개수 +1
					break; // 반복문 탈출
				}
			}
		}
		System.out.println(sb);
		br.close();
	}
}