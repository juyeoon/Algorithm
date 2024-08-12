import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 이분탐색으로 작은 수가 k-1개인 중앙값 찾기
// K번째 수는 K를 넘지 않음 => 1 ~ K번째 수 안에 답이 있음 => 시작: 1, 종료: K
// 중앙값보다 작거나 같은 수의 개수 => 중앙값 / 행(배수값)번호, 나눈 값이 N보다 크면 N
// 중앙값보다 큰 범위를 선택하는 경우 => 시작값 = 중앙값 + 1
// 중앙값보다 작거나 같은 범위를 선택하는 경우 => 종료값 = 중앙값 - 1, 정답 = 중앙값
public class B1300_K번째_수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 배열 크기
		int K = Integer.parseInt(br.readLine()); // 찾을 번호
		long start = 1; // 시작 인덱스
		long end = K; // 종료 인덱스
		long ans = 0; // 정답값
		while (start <= end) {
			long mid = (start + end) / 2; // 중앙값
			long cnt = 0; // 중앙값보다 작거나 같은 수의 총 개수
			for (int i = 1; i <= N; i++) { // 행마다 계산
				cnt += Math.min(mid / i, N); // 중앙값 / 행(배수값)번호, 나눈 값이 N보다 크면 N
			}
			if (cnt < K) { // 중앙값보다 큰 범위를 선택하는 경우
				start = mid + 1; // 시작값 = 중앙값 + 1
			} else { // 중앙값보다 작거나 같은 범위를 선택하는 경우
				end = mid - 1; // 종료값 = 중앙값 - 1
				ans = mid; // 정답 = 중앙값
			}
		}
		System.out.println(ans); // 출력
		br.close();
	}
}
