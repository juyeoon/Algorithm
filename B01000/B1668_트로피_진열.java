import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 왼쪽과 오른쪽으로 진행하면서 최댓값을 갱신하고(초기값: 제일 앞의 값) 뒤의 높이가 최댓값보다 큰 경우에만 카운트 & 최댓값 갱신
public class B1668_트로피_진열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 트로피 개수
		int height[] = new int[N]; // 트로피 높이 배열
		for (int i = 0; i < N; i++) { // input height[]
			height[i] = Integer.parseInt(br.readLine());
		}
		// 왼쪽
		int max = height[0]; // 최댓값
		int cnt = 1; // 카운트
		for (int i = 1; i < N; i++) {
			if (max < height[i]) {
				cnt++;
				max = height[i];
			}
		}
		sb.append(cnt).append("\n"); // 왼쪽값 출력
		// 오른쪽
		max = height[N - 1]; // 최댓값
		cnt = 1; // 카운트
		for (int i = N - 2; i >= 0; i--) {
			if (max < height[i]) {
				cnt++;
				max = height[i];
			}
		}
		sb.append(cnt).append("\n"); // 오른쪽값 출력
		System.out.println(sb); // 출력
		br.close();
	}
}