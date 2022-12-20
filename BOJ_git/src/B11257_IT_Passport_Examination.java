import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 불합격 조건
// 총점이 55가 안 되거나
// 각 항목의 총점의 30%가 안 되면 불합격
public class B11257_IT_Passport_Examination {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine().trim()); // 테스트케이스
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			sb.append(st.nextToken()).append(" ");
			boolean pass = true; // 합격 여부
			int a = Integer.parseInt(st.nextToken()); // 전략
			int b = Integer.parseInt(st.nextToken()); // 관리
			int c = Integer.parseInt(st.nextToken()); // 기술
			int score = a + b + c; // 총점
			if (a < 35 * 1.0 * 30 / 100 || b < 25 * 1.0 * 30 / 100 || c < 40 * 1.0 * 30 / 100 || score < 55) { // 불합격 조건
				pass = false;
			}
			sb.append(score).append(" ").append(pass ? "PASS" : "FAIL").append("\n"); // 합격 여부에 따라 출력
		}
		System.out.println(sb);
		br.close();
	}
}