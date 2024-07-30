import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// L4좌석은 12열 4번 좌석
// 따라서 열이 12개 미만이거나 좌석이 4번 미만이면 L4 좌석은 존재할 수 없음
// L4 좌석이 존재한다면 11행까지의 좌석의 수의 합 + 4 = 11 * 한 열의 좌석 개수 + 4
public class B18247_겨울왕국_티켓_예매 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); // 영화관 열 개수
			int M = Integer.parseInt(st.nextToken()); // 한 열의 좌석 개수
			if (N < 12 || M < 4) { // L4 좌석이 없으면
				sb.append("-1\n");
				continue;
			}
			sb.append(11 * M + 4).append("\n"); // L4 좌석 출력
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
