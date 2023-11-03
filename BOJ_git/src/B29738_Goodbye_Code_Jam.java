import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 등수(조건)에 따라 나누어 출력
public class B29738_Goodbye_Code_Jam {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스
		for (int tc = 1; tc <= T; tc++) {
			sb.append("Case #").append(tc).append(": ");
			int y = Integer.parseInt(br.readLine()); // 등수
			if (y > 4500) { // 4501등 ~
				sb.append("Round 1");
			} else if (y > 1000) { // 1001등 ~ 4500등
				sb.append("Round 2");
			} else if (y > 25) { // 26등 ~ 1000등
				sb.append("Round 3");
			} else { // ~ 25등
				sb.append("World Finals");
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}