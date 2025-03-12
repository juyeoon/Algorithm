import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// n에 대해 최소 횟수를 저장하는 배열(dp) 사용
public class B17626_Four_Squares {
	static int[] dp; // 숫자마다

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 자연수 n
		dp = new int[n + 1]; // 1~n까지
		dp[1] = 1;
		System.out.println(memo(n));
		br.close();
	}

	public static int memo(int n) {
		if (n == 0) { // dp[0] == 0이기 때문에 따로 처리
			return 0;
		}
		if (dp[n] == 0) { // 한번도 계산이 안 되었으면
			int min = 5; // 최소 개수 - 4개 이상은 안 나오므로 5로 설정
			int cnt = (int) Math.sqrt(n); // n의 제곱근의 정수부분
			while (cnt >= 1) {
				min = Math.min(min, memo(n - cnt * cnt)); // 최솟값 계산 - n에서 가장 큰 제곱수, 그 다음 큰 제곱수을 빼가며 최소 횟수 구하기
				if (min == 0) { // 0이면 더이상 최소가 될 수 없기 때문에 break
					break;
				}
				cnt--; // 제곱수 크기 줄이기
			}
			dp[n] = min + 1; // 최소 횟수에서 + 해주기
		}
		return dp[n]; // n의 최소 횟수 리턴
	}

}
