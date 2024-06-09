import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// DFS 사용. depth가 5면 존재. 시작노드를 모든 노드로 한 후 확인 필요.
public class B13023_ABCDE {
	public static boolean exists = false; // 5명이 연결된 관계가 있는지(true: 있음)
	public static boolean isVisited[]; // 노드 방문 기록
	public static ArrayList<Integer>[] A; // 인접리스트

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 노드 수
		int M = Integer.parseInt(st.nextToken()); // 엣지 수
		isVisited = new boolean[N];
		A = new ArrayList[N]; // 인접리스트 생성
		for (int i = 0; i < N; i++) {
			A[i] = new ArrayList<>();
		}
		for (int i = 0; i < M; i++) { // 인접리스트 값 채우기
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			A[s].add(e);
			A[e].add(s);
		}
		for (int i = 0; i < N; i++) { // 모든 노드를 시작노드로 한 후 확인
			if (exists) {
				break;
			}
			dfs(i, 1);
		}
		System.out.println(exists ? 1 : 0); // 존재하면 1 아니면 0 출력
		br.close();
	}

	public static void dfs(int v, int depth) {
		if (depth == 5) { // 깊이가 5면 친구관계 존재
			exists = true;
			return;
		}
		if (exists) { // 이미 존재하면 더이상 확인 X
			return;
		}
		isVisited[v] = true; // 방문 체크
		for (int i : A[v]) { // 다음 depth DFS
			if (!isVisited[i]) {
				dfs(i, depth + 1);
			}
		}
		isVisited[v] = false; // 다음 노드를 위해 방문 해제
	}
}