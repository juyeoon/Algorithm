import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/16255
// 각 팀이 앞으로 전부 이긴다고 가정하여 승리 조건을 만족시키기까지 필요한 점수 증가량 게산
public class B16255_Martian_Volleyball {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken()); // 승리 조건 최소 점수
			int x = Integer.parseInt(st.nextToken()); // 현재 1팀의 점수
			int y = Integer.parseInt(st.nextToken()); // 현재 2팀의 점수
			int win1 = Math.max(k - x, (y + 2) - x); // 1팀이 이기는 경우 최소 공 개수
			int win2 = Math.max(k - y, (x + 2) - y); // 2팀이 이기는 경우 최소 공 개수
			sb.append(Math.min(win1, win2)).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
