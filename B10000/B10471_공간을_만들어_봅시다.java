import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 파티션을 모두 세웠을 때 만들어지는 방을 한 칸이라고 생각
// 1~P+1개의 칸을 연결했을 때의 각각의 방의 폭을 구하여 boolean 배열에 저장(idx: 방의 폭, value: 가능 여부)
// 한 칸의 폭을 배열에 저장 (P+1개의 칸)하며 boolean 배열에 가능 여부 저장
// 반복문을 돌며 2~P개의 칸을 연결했을 때의 방의 폭을 구하기 (슬라이딩 윈도우)
// boolean 배열을 돌며 true인 idx 출력
public class B10471_공간을_만들어_봅시다 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int W = Integer.parseInt(st.nextToken()); // 전체 폭
		int P = Integer.parseInt(st.nextToken()); // 파티션의 개수
		boolean isposs[] = new boolean[W + 1]; // 가능한 방의 폭 (true: 가능)
		st = new StringTokenizer(br.readLine());

		int size[] = new int[P + 1]; // 모든 파티션을 세웠을 때의 각각의 방의 크기 (최소 단위 방의 크기)
		int pre = 0; // 이전 파티션 위치
		for (int i = 0; i < P; i++) {
			int now = Integer.parseInt(st.nextToken()); // 현재 파티션 위치
			size[i] = now - pre; // 방의 크기 구하기
			isposs[size[i]] = true; // 방의 크기 가능 여부 저장
			pre = now; // 이전 파티션 위치 갱신
		}
		size[P] = W - pre; // 최대 방의 크기
		isposs[size[P]] = true; // 방의 크기 가능 여부 저장

		// 모든 경우의 방의 폭 구하기
		for (int i = 2; i <= P + 1; i++) { // 연결된 방의 개수 (2~P+1)
			int sum = 0; // 각 구역의 폭의 합
			for (int j = 0; j < i; j++) { // 0부터 시작한 방의 크기(초기값)
				sum += size[j];
			}
			isposs[sum] = true; // 위에서 구한 방의 크기 가능 여부 저장

			for (int j = i; j <= P; j++) { // 한 칸씩 옆으로 이동 (슬라이딩 윈도우)
				sum += size[j]; // 옆으로 이동했을 때 추가되는 구역의 폭 추가
				sum -= size[j - i]; // 옆으로 이동했을 때 제거되는 구역의 폭 추가
				isposs[sum] = true; // 구한 방의 크기 가능 여부 저장
			}
		}
		// 방 크기 가능 여부 배열을 순호하며 가능한 방의 크기 출력
		for (int i = 1; i <= W; i++) {
			if (isposs[i]) {
				sb.append(i).append(" ");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}