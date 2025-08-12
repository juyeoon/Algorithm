import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/27475
// 아래 출발 열차와 왼쪽 출발 열차가 충돌하는 경우는 번호가 같은 경우
// 따라서 두 목록의 교집합 크기가 취소해야 하는 최소 열차 수가 됨
// 왼쪽 출발 목록을 boolean 배열로 표시 후 아래 출발 목록을 순회하며 같은 번호 여부를 확인
public class B27475_Cancel_the_Trains {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()); // 아래에서 출발하는 열차 수
			int m = Integer.parseInt(st.nextToken()); // 왼쪽에서 출발하는 열차 수
			int[] bottom = new int[n]; // 아래 출발 열차 번호
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				bottom[i] = Integer.parseInt(st.nextToken());
			}
			boolean[] leftnum = new boolean[101]; // 왼쪽에서 출발하는 열차 번호
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < m; i++) {
				leftnum[Integer.parseInt(st.nextToken())] = true;
			}
			int cancel = 0; // 같은 번호 열차 개수 세기
			for (int v : bottom) {
				if (leftnum[v]) { // 같은 번호면 반드시 한 대 취소 필요
					cancel++;
				}
			}
			sb.append(cancel).append('\n');
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
