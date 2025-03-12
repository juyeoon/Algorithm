import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 여행지에 도착할 수 있는 우주선 => 가지고 있는 연료량 >= 소비 연료양
// 소비 연료양 = 연료소비율 * 걸리는 시간
// = 연료소비율 * 목적지까지의 거리 / 최고속도
public class B9501_꿍의_우주여행 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); // 우주선의 개수
			double D = Double.parseDouble(st.nextToken()); // 목적지 까지의 거리
			int cnt = 0; // 꿍이 가고싶어하는 곳까지 여행할 수 있는 우주선 개수
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				int v = Integer.parseInt(st.nextToken()); // 우주선의 최고속도
				Double f = Double.parseDouble(st.nextToken()); // 우주선의 연료양
				int c = Integer.parseInt(st.nextToken()); // 우주선의 연료소비율
				if (f >= c * D / v) { // 가지고 있는 연료량 >= 소비 연료양
					cnt++; // 카운트
				}
			}
			sb.append(cnt).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}