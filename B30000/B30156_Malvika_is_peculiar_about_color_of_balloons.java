import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 두 풍선 색의 개수를 각각 센 후 더 작은 수의 색깔을 변경
public class B30156_Malvika_is_peculiar_about_color_of_balloons {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			char c[] = br.readLine().toCharArray(); // 풍선 색깔
			int aCnt = 0; // a의 개수
			int bCnt = 0; // b의 개수
			for (int i = 0; i < c.length; i++) {
				if (c[i] == 'a') { // 풍선 색깔 a
					aCnt++;
				} else { // 풍선 색깔 b
					bCnt++;
				}
			}
			sb.append(Math.min(aCnt, bCnt)).append("\n"); // 더 작은 수의 색깔을 변경
		}
		System.out.println(sb); // 출력
		br.close();
	}
}