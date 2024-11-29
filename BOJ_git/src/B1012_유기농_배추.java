import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1012
// 풀이: dfs로 4방(상우하좌)으로 연결된 덩어리(그래프)가 몇 개인지 확인
// 인접리스트와 인접 행렬을 사용하지 않고 그냥 주어진 배열에서 사방으로 깊이 우선 탐색
// main에서 dfs() 밑으로 떨어지면 카운트하여 덩어리 개수를 카운트
public class B1012_유기농_배추 {
	public static boolean[][] arr; // 배추 배열
	public static boolean[][] isvisited; // 방문 배열
	public static int N, M; // 배열 크기
	public static int[] dx = { 0, 1, 0, -1 }; // 사방 탐색 i
	public static int[] dy = { -1, 0, 1, 0 }; // 사방 탐색 j

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) { // 테스트케이스
			StringTokenizer st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken()); // 가로 크기
			N = Integer.parseInt(st.nextToken()); // 세로 크기
			int K = Integer.parseInt(st.nextToken()); // 배추 개수
			arr = new boolean[N][M]; // 배추 배열 초기화
			isvisited = new boolean[N][M]; // 방문 배열 초기화
			for (int i = 0; i < K; i++) { // 배추 위치
				st = new StringTokenizer(br.readLine());
				int y = Integer.parseInt(st.nextToken());
				int x = Integer.parseInt(st.nextToken());
				arr[x][y] = true; // 배추 표기
			}
			int cnt = 0; // 벌레(덩어리, 그래프) 개수
			for (int i = 0; i < N; i++) { // dfs 시작점 찾는 반복문
				for (int j = 0; j < M; j++) {
					if (arr[i][j] && !isvisited[i][j]) { // 배추가 있고 방문 안 했으면
						dfs(i, j); // dfs 시작
						cnt++; // 그래프 탐색 끝, 카운트
					}
				}
			}
			sb.append(cnt).append("\n"); // 카운트 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}

	public static void dfs(int i, int j) { // dfs
		isvisited[i][j] = true; // 방문 표기
		for (int l = 0; l < 4; l++) { // 사방 탐색
			int nexti = i + dx[l]; // 다음 i
			int nextj = j + dy[l]; // 다음 j
			// 배열 범위를 벗어나지 않고
			// 배추가 있고 방문 안 했으면 dfs
			if (0 <= nexti && nexti < N && 0 <= nextj && nextj < M && arr[nexti][nextj] && !isvisited[nexti][nextj]) {
				dfs(nexti, nextj);
			}
		}
	}
}
