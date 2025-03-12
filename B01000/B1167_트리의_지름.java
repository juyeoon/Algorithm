import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 아무 노드에서 bfs로 최대 거리를 가지는 노드를 찾은 후 
// 그 노드에서 다시 bfs를 실행하여 최대 거리 찾기
public class B1167_트리의_지름 {
	public static int N; // 트리의 정점 개수
	public static ArrayList<Node>[] adjList; // 인접리스트
	public static int[] distance; // 두 정점 사이의 거리

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		N = Integer.parseInt(br.readLine()); // 트리 정점 개수
		adjList = new ArrayList[N + 1]; // 인접리스트 생성
		for (int i = 1; i <= N; i++) {
			adjList[i] = new ArrayList<Node>();
		}
		for (int i = 0; i < N; i++) { // 인접리스트 채우기
			st = new StringTokenizer(br.readLine(), " ");
			int start = Integer.parseInt(st.nextToken()); // 시작 노드
			int end = 0; // 도착 노드
			int weight = 0; // 가중치(거리)
			end = Integer.parseInt(st.nextToken());
			while (end != -1) {
				weight = Integer.parseInt(st.nextToken());
				adjList[start].add(new Node(end, weight));
				end = Integer.parseInt(st.nextToken());
			}
		}
		distance = new int[N + 1]; // 두 정점 사이의 거리
		bfs(1); // 1번 노드와의 거리 구하기
		int maxV = 0; // 최대 거리를 가지는 노드
		int maxD = 0; // 최대 거리
		for (int i = 1; i <= N; i++) { // 최댓값 찾기
			if (maxD < distance[i]) {
				maxD = distance[i];
				maxV = i;
			}
		}
		distance = new int[N + 1]; // 거리 배열 초기화
		bfs(maxV); // 최대 거리르 가지는 노드부터 다시 bfs로 최대 거리 찾기
		maxD = 0; // 최대 거리 초기화
		for (int i : distance) { // 최대 거리 찾기 
			maxD = Math.max(maxD, i);
		}
		System.out.println(maxD); // 출력
		br.close();
	}
	
	// 거리를 찾기 위한 bfs
	public static void bfs(int start) {
		boolean[] isVisited = new boolean[N + 1]; // 방문 배열
		Queue<Integer> queue = new LinkedList<>(); // 큐
		queue.add(start); // 초기값을 큐에 삽입
		while (!queue.isEmpty()) {
			int nowV = queue.poll(); // 현재 노드
			isVisited[nowV] = true; // 방문 체크
			for (Node n : adjList[nowV]) {
				int e = n.end; // 노드
				int w = n.weight; // 가중치(거리)
				if (!isVisited[e]) { // 방문하지 않으면
					queue.add(e); // 큐에 삽입
					distance[e] = distance[nowV] + w; // 현재 거리 더하기
				}
			}
		}

	}
}

class Node {
	int end; // 도착 노드
	int weight; // 가중치

	public Node(int end, int weight) { // 생성자
		this.end = end;
		this.weight = weight;
	}
}
