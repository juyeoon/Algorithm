import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 재귀 함수 사용
public class B2775_부녀회장이_될테야 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 1; tc <= T; tc++) {
			int k = Integer.parseInt(br.readLine()); // 층
			int n = Integer.parseInt(br.readLine()); // 호
			System.out.println(calkon(k, n));
		}
		br.close();
	}
	public static int calkon(int k, int n) {
		// 기저 조건
		if (k == 0) { // 0층에는 n명
			return n;
		} else if (n == 1) { // 1호에는 1명
			return 1;
		} else { // 유도 부분
			return calkon(k - 1, n) + calkon(k, n - 1); // 재귀호출
		}
	}
}
