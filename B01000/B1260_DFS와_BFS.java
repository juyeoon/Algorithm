import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// dfs와 bfs 구현
// 정점 번호가 작은 것부터 방문할 수 있게 정렬을 수행하는 것 주의
public class B1260_DFS와_BFS {
	public static StringBuilder sb;
	public static boolean[] visitedDFS; // DFS 방문 기록
	public static boolean[] visitedBFS; // BFS 방문 기록
	public static ArrayList<Integer>[] adjList; // 인접리스트

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 정점 개수
		int M = Integer.parseInt(st.nextToken()); // 간선 개수
		int V = Integer.parseInt(st.nextToken()); // 탐색 시작 정점
		visitedDFS = new boolean[N + 1]; // 생성
		visitedBFS = new boolean[N + 1]; // 생성
		adjList = new ArrayList[N + 1]; // 생성
		for (int i = 1; i <= N; i++) { // 인접리스트 생성
			adjList[i] = new ArrayList<>();
		}
		for (int i = 0; i < M; i++) { // 인접리스트 채우기
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			adjList[s].add(e);
			adjList[e].add(s);
		}
		for (int i = 1; i <= N; i++) { // 정점 번호가 작은 것 먼저 방문하기 위한 정렬
			Collections.sort(adjList[i]);
		}
		dfs(V); // dfs 실행
		sb.append("\n");
		bfs(V); // bfs 실행
		System.out.println(sb); // 출력
		br.close();
	}

	public static void dfs(int v) { // dfs
		visitedDFS[v] = true;
		sb.append(v).append(" ");
		for (int i : adjList[v]) {
			if (!visitedDFS[i]) {
				dfs(i);
			}
		}
	}

	public static void bfs(int start) { // bfs
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		visitedBFS[start] = true;
		while (!queue.isEmpty()) {
			int v = queue.poll();
			sb.append(v).append(" ");
			for (int i : adjList[v]) {
				if (!visitedBFS[i]) {
					queue.add(i);
					visitedBFS[i] = true;
				}
			}
		}
	}
}
