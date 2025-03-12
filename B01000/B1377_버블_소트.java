import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 위치를 중심으로 생각
// 하나의 i에서 움직이는 수(정렬되는 수)가 아닌 밀리는 수는 최대 1만큼 왼쪽으로 움직여질 수 있음
// 정렬이 끝났을 때 i가 얼마가 되었는지 확인하면 답을 구할 수 있기 때문에 왼쪽으로 최대로 움직인 수로 구할 수 있음
// 값의 정렬 전 위치와 정렬 후 위치를 구한 후 현재 위치  - 이전 위치로 얼마나 이동했는지 구함
// 이동거리의 최솟값(왼쪽으로 이동한 최댓값과 같음)을 구한 후 양수로 변환 후 +1을 하여 출력
// +1을 하는 이유 => 정렬이 끝난 후에도 한 번 반복문이 돌기 때문
public class B1377_버블_소트 {
	static class Node implements Comparable<Node> {
		int idx; // 원래의 위치
		int value; // 값

		Node(int idx, int value) { // 생성자
			this.idx = idx;
			this.value = value;
		}

		@Override
		public int compareTo(Node o) { // 값을 기준으로 비교
			return this.value - o.value;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 입력값 개수
		Node[] arr = new Node[N]; // 정렬 배열
		for (int i = 0; i < N; i++) { // arr[] 값 넣기
			arr[i] = new Node(i, Integer.parseInt(br.readLine()));
		}
		Arrays.sort(arr); // 값을 기준으로 오름차순 정렬 O(NlogN)
		int min = Integer.MAX_VALUE; // 최소 거리
		for (int i = 0; i < N; i++) { // 최소 거리 찾기
			min = Math.min(min, i - arr[i].idx); // 정렬 후 위치 - 정렬 전 위치 = 이동 거리
		}
		System.out.println(-1 * min + 1); // swap이 일어나지 않는 반복문이 한 번 더 실행되기 때문에 + 1
		br.close();
	}
}