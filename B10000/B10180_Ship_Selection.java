import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/10180
// 함선이 갈 수 있는 최대 거리 = 최고 속도 * 연료로 갈 수 있는 최대 시간
// = 최고 속도(v) * (연료의 양(i) / 연료소비량(c))
public class B10180_Ship_Selection {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); // 함선의 수
			int D = Integer.parseInt(st.nextToken()); // 가야하는 거리
			int cnt = 0; // 목적지에 도착할 수 있느 함선의 수
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				double v = Double.parseDouble(st.nextToken()); // 최고 속도
				double f = Double.parseDouble(st.nextToken()); // 연료의 양
				double c = Double.parseDouble(st.nextToken()); // 연료소비량
				if (f / c * v >= D) { // 함선이 갈 수 있는 최대 거리가 목적지까지의 거리 이상이면
					cnt++; // 카운트
				}
			}
			sb.append(cnt).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
