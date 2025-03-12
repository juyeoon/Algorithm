import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// DFS 활용
// 인접리스트에 정점과 간선의 정보를 입력
// 방문하지 않은 정점 중 아무거나 시작 정점으로 잡고 dfs
// dfs 호출이 모두 끝나면 연결된 정점들을 모두 방문한 것. 카운트 1 올리기
// 모든 정점을 방문할 때까지 반복 후 카운트 출력
public class B11724_연결_요소의_개수 {
	public static boolean visited[]; // 방문 기록
	public static ArrayList<Integer>[] A; // 인접리스트

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 정점의 개수
		int M = Integer.parseInt(st.nextToken()); // 간선의 개수
		visited = new boolean[N + 1]; // 방문 기록
		A = new ArrayList[N + 1]; // 인접리스트
		for (int i = 1; i <= N; i++) { // 인접리스트 초기화
			A[i] = new ArrayList<>();
		}
		for (int i = 0; i < M; i++) { // 인접리스트에 값 넣기
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			A[u].add(v);
			A[v].add(u);
		}
		int cnt = 0; // 연결요소 개수
		for (int i = 1; i <= N; i++) { // 시작 정점
			if (visited[i]) { // 방문한 정점이면 넘기기
				continue;
			}
			dfs(i); // DFS
			cnt++; // 카운트
		}
		System.out.println(cnt); // 출력
		br.close();
	}

	public static void dfs(int v) { // DFS
		if (visited[v]) { // 방문한 정점이면 바로 return
			return;
		}
		visited[v] = true; // 방문 표시
		for (int i : A[v]) { // 인접리스트에 있는 값들 DFS 호출
			if (!visited[i]) { // 방문하지 않은 정점들만
				dfs(i);
			}
		}
	}
}