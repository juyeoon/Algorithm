import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//사방 탐색 활용
public class B1913_달팽이 {
	static final int[] di = { 1, 0, -1, 0 }; // 하우상좌
	static final int[] dj = { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 달팽이 배열 사이즈
		int num = Integer.parseInt(br.readLine()); // 위치 확인할 번호
		int[][] map = new int[N][N]; // 달팽이 배열
		int cnt = N * N; // 배열에 들어가는 수 중 최댓값 (1씩 줄일 것)
		int i = 0; // 현재 위치(행)
		int j = 0; // 현재 위치(열)
		int dir = 0; // 방향 인덱스(di,dj)
		int numi = 0; // 위치 확인할 번호 위치(행)
		int numj = 0; // 위치 확인할 번호 위치(열)
		while (cnt > 0) { // cnt = 1까지 졸리기
			int ni = i + di[dir]; // 다음 위치(행)
			int nj = j + dj[dir]; // 다음 위치(열)
			// cnt가 1이 아니고(1이면 계속 돌게됨)
			// 배열 범위를 벗어나거나 다음 위치에 값이 있으면
			// 방향 전환
			if (cnt != 1 && (ni < 0 || nj < 0 || ni >= N || nj >= N || map[ni][nj] != 0)) {
				dir = (++dir) % 4; // 방향 전환
				continue; // 밑에 생략. 반복문 다음 실행
			}
			if (cnt == num) { // 위치 확인할 번호일 때
				numi = i + 1; // 위치(행)
				numj = j + 1; // 위치(열) 저장
			}
			map[i][j] = cnt--; // 배열에 값 넣기
			i = ni; // 현재 위치를 다음 위치로(행)
			j = nj; // 현재 위치를 다음 위치로(열)
		}
		// 출력
		for (int k = 0; k < N; k++) {
			for (int k2 = 0; k2 < N; k2++) {
				sb.append(map[k][k2]).append(" ");
			}
			sb.append("\n");
		}
		sb.append(numi).append(" ").append(numj);
		System.out.println(sb);
		br.close();
	}
}