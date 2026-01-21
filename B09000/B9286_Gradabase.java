import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/9286
public class B9286_Gradabase {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int m = Integer.parseInt(br.readLine());
			sb.append("Case ").append(tc).append(":\n");
			for (int i = 0; i < m; i++) {
				int grade = Integer.parseInt(br.readLine());
				int nextGrade = grade + 1;
				if (nextGrade >= 1 && nextGrade <= 6) {
					sb.append(nextGrade).append("\n");
				}
			}
		}
		System.out.println(sb);
		br.close();
	}
}
