import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// dp 문제
// n까지 올라오는 경우는
// n-2를 밟고 올라오는 경우
// n-3과 n-1을 밟고 올라오는 경우
// 둘 중 하나이다
public class B2579_계단_오르기 {
	public static Integer[] dp, stair;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 계단 개수
		stair = new Integer[N + 1]; // 계단 값: 1~N 사용
		dp = new Integer[N + 1]; // dp 값: 1~N 사용
		stair[0] = 0; // 인덱스 0 초기화
		for (int i = 1; i <= N; i++) { // input stair[]
			stair[i] = Integer.parseInt(br.readLine());
		}
		dp[0] = stair[0]; // dp 초기화
		dp[1] = stair[1]; // dp 초기화
		if (N >= 2) { // dp 초기화
			dp[2] = stair[1] + stair[2];
		}
		System.out.println(find(N)); // dp[N] 출력
		br.close();

	}

	// 메모이제이션 메서드
	public static int find(int N) {
		if (dp[N] == null) { // dp에 값이 없으면
			// N-2+N 밟는 경우, N-3+N-1+N 밟는 경우 중 최댓값으로 설정
			dp[N] = Math.max(find(N - 2), find(N - 3) + stair[N - 1]) + stair[N];
		}
		return dp[N]; // dp[N] 반환
	}
}