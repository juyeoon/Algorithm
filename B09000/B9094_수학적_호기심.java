import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// a와 b를 이중 for문으로 모든 경우의 수에 나누어떨어지는지 확인(브루트포스)
public class B9094_수학적_호기심 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()); // n
			int m = Integer.parseInt(st.nextToken()); // m
			int cnt = 0; // 정수인 개수
			for (int a = 1; a < n - 1; a++) { // a
				for (int b = a + 1; b < n; b++) { // b
					if ((a * a + b * b + m) % (a * b) == 0) { // 나누어 떨어짐
						cnt++; // 개수 ++
					}
				}
			}
			sb.append(cnt).append("\n");
		}
		System.out.println(sb); // 출력
		br.readLine();
	}
}