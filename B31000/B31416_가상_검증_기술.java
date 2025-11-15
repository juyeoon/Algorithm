import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/31416
// A 항목 중 i개를 도훈이, 나머지 (VA - i)개를 상혁이가 한다고 하면
// 도훈 시간 => i * TA + VB * TB
// 상혁 시간 => (VA - i) * TA
// 두 사람은 동시에 일하므로 전체 완료 시간 = max(도훈 시간, 상혁 시간)
// i를 0 ~ VA까지 다 돌려보면서, 가능한 최소 완료 시간 찾기
public class B31416_가상_검증_기술 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int TA = Integer.parseInt(st.nextToken()); // 차종 A 1회 시뮬레이션 시간
			int TB = Integer.parseInt(st.nextToken()); // 차종 B 1회 시뮬레이션 시간
			int VA = Integer.parseInt(st.nextToken()); // 차종 A 항목 개수
			int VB = Integer.parseInt(st.nextToken()); // 차종 B 항목 개수
			int minTime = Integer.MAX_VALUE; // 최소 완료 시간
			for (int i = 0; i <= VA; i++) {
				int dt = i * TA + VB * TB; // 도훈 시간
				int sht = (VA - i) * TA; // 상혁 시간
				int end = Math.max(dt, sht); // 완료 시간
				if (end < minTime) { // 갱신
					minTime = end;
				}
			}
			sb.append(minTime).append("\n"); // 출력
		}
		System.out.println(sb);
		br.close();
	}
}
