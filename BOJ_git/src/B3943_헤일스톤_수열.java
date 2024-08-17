import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 규칙에 맞게 단순 구현
public class B3943_헤일스톤_수열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			int n = Integer.parseInt(br.readLine()); // n
			int max = n; // 최댓값
			while (n > 1) { // n이 1이 될 때까지
				if (n % 2 == 1) { // 홀수면
					n = n * 3 + 1;
				} else { // 짝수면
					n /= 2;
				}
				max = Math.max(max, n); // 항 바뀔 때마다 최댓값 갱신
			}
			sb.append(max).append("\n"); // 최댓값 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
