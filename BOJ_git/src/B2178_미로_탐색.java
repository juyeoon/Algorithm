import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// BFS를 사용하여 이차원 배열의 현재 칸의 사방을 탐색하면서 그 칸까지 지난 최소의 칸 수를 더하여 누적값을 저장
// 탐색을 끝낸 후 2차원 배열의 마지막 값을 출력
public class B2178_미로_탐색 {
	public static int N, M; // 미로 크기
	public static int[][] A; // 미로 맵

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		A = new int[N][M];
		for (int i = 0; i < N; i++) { // A[][] 채우기
			char[] c = br.readLine().toCharArray();
			for (int j = 0; j < M; j++) {
				A[i][j] = c[j] - '0';
			}
		}
		bfs(); // BFS 실행
		System.out.println(A[N - 1][M - 1]); // 미로의 마지막 값 출력
		br.close();
	}

	public static void bfs() {
		boolean[][] visited = new boolean[N][M]; // 방문 배열
		Queue<int[]> queue = new LinkedList<>(); // 큐
		int[] dx = { 0, 0, -1, 1 }; // 사방탐색 X
		int[] dy = { -1, 1, 0, 0 }; // 사방탐색 Y
		int nowX = 0; // 현재 칸 X
		int nowY = 0; // 현재 칸 Y
		queue.add(new int[] { 0, 0 }); // BFS 시작값 세팅
		visited[0][0] = true;
		while (!queue.isEmpty()) {
			nowX = queue.peek()[0]; // 큐의 첫 값 X
			nowY = queue.peek()[1]; // 큐의 첫 값 Y
			queue.poll();
			for (int k = 0; k < 4; k++) { // 사방 탐색
				int X = nowX + dx[k]; // 탐색할 칸 X
				int Y = nowY + dy[k]; // 탐색할 칸 Y
				if (X >= 0 && Y >= 0 && X < N && Y < M) { // 배열 범위
					if (!visited[X][Y] && A[X][Y] == 1) { // 방문하지 않았고 길이 있으면
						queue.add(new int[] { X, Y }); // 큐에 넣고
						visited[X][Y] = true; // 방문 표시
						A[X][Y] += A[nowX][nowY]; // 누적값 갱신
					}
				}
			}
		}
	}
}