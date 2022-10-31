import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 자식이 가질 사탕의 수 = 전체 사탕의 수 / 형제의 수
// 아버지가 가질 사탕의 수 = 전체 사탕의 수 % 형제의 수
public class B10178_할로윈의_사탕 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(st.nextToken()); // 전체 사탕의 수
			int v = Integer.parseInt(st.nextToken()); // 형제의 수
			sb.append("You get ").append(c / v).append(" piece(s) and your dad gets ").append(c % v)
					.append(" piece(s).\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}