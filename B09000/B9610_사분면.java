import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 좌표에 따라 사분면의 좌표 개수를 저장하는 배열에 개수 갱신 
public class B9610_사분면 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int n = Integer.parseInt(br.readLine()); // 좌표 개수
		int cnt[] = new int[5]; // [0] => 좌표축 위 좌표 개수, [k] => k 사분면 위 좌표 개수
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()); // x좌표
			int y = Integer.parseInt(st.nextToken()); // y좌표
			if (x == 0 || y == 0) { // 좌표축 위
				cnt[0]++;
			} else if (x > 0) {
				if (y > 0) { // 제1사분면
					cnt[1]++;
				} else if (y < 0) { // 제4사분면
					cnt[4]++;
				}
			} else if (x < 0) {
				if (y > 0) { // 제2사분면
					cnt[2]++;
				} else if (y < 0) { // 제3사분면
					cnt[3]++;
				}
			}
		}
		for (int i = 1; i <= 4; i++) { // 1~4사분면 개수
			sb.append("Q").append(i).append(": ").append(cnt[i]).append("\n");
		}
		sb.append("AXIS: ").append(cnt[0]); // 좌표축 위 개수
		System.out.println(sb); // 출력
		br.close();
	}
}
