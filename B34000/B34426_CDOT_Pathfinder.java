import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/34426
// 가장 빠른 경로 찾기. => 시간 = 거리 / 속도
// 오차를 줄이기 위해 곱으로 비교
public class B34426_CDOT_Pathfinder {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 구간(leg) 수
		for (int tc = 1; tc <= T; tc++) {
			int R = Integer.parseInt(br.readLine()); // 구간의 후보 경로 수
			StringTokenizer st = new StringTokenizer(br.readLine());
			int bestIdx = 1; // 가장 빠른 경로 인덱스
			long bestD = 0; // 거리
			long bestS = 1; // 속도
			for (int i = 1; i <= R; i++) {
				int speed = Integer.parseInt(st.nextToken()); // 평균 속도
				int dist = Integer.parseInt(st.nextToken()); // 거리
				if (i == 1) { // 첫 경로
					bestIdx = 1;
					bestD = dist;
					bestS = speed;
				} else {
					// dist/speed < bestD/bestS ⇔ dist*bestS < bestD*speed
					if ((long) dist * bestS < bestD * (long) speed) {
						bestIdx = i;
						bestD = dist;
						bestS = speed;
					}
				}
			}
			sb.append(bestIdx).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
