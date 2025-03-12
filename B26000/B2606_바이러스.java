import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 연결된 노드가 최대 100대이기 때문에 dfs 사용하여 연결된 노드 확인
// 연결된 노드 개수가 필요한 것이므로 메모리 낭비를 줄이기 위해 노드를 0부터 N-1까지라고 생각
// 인접리스트와 dfs 재귀 호출을 사용하여 0번 노드와 연결된 노드 방문 시 카운트
public class B2606_바이러스 {
	public static boolean[] isVisited; // 노드 방문 여부
	public static ArrayList<ArrayList<Integer>> adjList; // 인접 리스트
	public static int cnt; // 0번 노드와 연결된 노드 개수

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 노드 개수
		int E = Integer.parseInt(br.readLine()); // 엣지 개수
		isVisited = new boolean[N]; // 방문 배열 생성
		cnt = 0; // 개수 초기값
		adjList = new ArrayList<>(); // 인접 리스트 생성
		for (int i = 0; i < N; i++) {
			adjList.add(new ArrayList<Integer>());
		}
		StringTokenizer st = null;
		for (int i = 0; i < E; i++) { // 인접 리스트 채우기
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1; // 0번 노드부터 시작하기 때문에 -1 필요
			int b = Integer.parseInt(st.nextToken()) - 1;
			adjList.get(a).add(b);
			adjList.get(b).add(a);
		}
		dfs(0); // 0번 노드부터 시작
		System.out.println(cnt - 1); // 0번 노드도 포함되어 있기 때문에 -1 필요
		br.close();
	}

	public static void dfs(int v) { // dfs
		isVisited[v] = true; // 방문 기록
		cnt++; // 카운트
		for (int i : adjList.get(v)) { // 인접 노드
			if (!isVisited[i]) { // 방문 기록 없는 것만
				dfs(i);
			}
		}
	}
}