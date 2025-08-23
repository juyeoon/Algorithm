import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/34125
// 모든 좌석을 순회하여 빈 좌석이면 거리를 계산하여 최솟값을 찾아 해당하는 좌표를 저장하여 출력
public class B34125_래환이의_아이브_콘서트_이야기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 행 수
		int M = Integer.parseInt(st.nextToken()); // 열 수
		int mid = (M + 1) / 2; // 가운데 열 번호
		int bestR = -1; // 최적 행 좌표
		int bestC = -1; // 최적 열 좌표
		int bestD = Integer.MAX_VALUE; // 최소 거리
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				int seat = Integer.parseInt(st.nextToken()); // 현재 좌석 상태
				if (seat == 0) { // 빈 좌석이면
					int dist = (i + 1) + Math.abs(mid - (j + 1)); // 거리
					if (dist < bestD) { // 최소 거리와 최적값 갱신
						bestD = dist;
						bestR = i;
						bestC = j;
					}
				}
			}
		}
		if (bestR == -1) { // 빈 좌석이 없음
			System.out.println(-1);
		} else {
			System.out.println((bestR + 1) + " " + (bestC + 1)); // 출력
		}
		br.close();
	}
}
