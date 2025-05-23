import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/13228
// 가야하는 거리 = 건물 1 내려가는 거리 + 가로로 걸어가야 하는 거리 + 세로로 걸어가야 하는 거리 + 건물2 올라가야하는 거리
// = floor1 + |x1-x2| + |y1-y2| + floor2
public class B13228_The_REAL_Manhattan_distance {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken()); // 건물 1 x좌표
			int y1 = Integer.parseInt(st.nextToken()); // 건물 1 y좌표
			int floor1 = Integer.parseInt(st.nextToken()); // 건물 1 층수
			int x2 = Integer.parseInt(st.nextToken()); // 건물 2 x좌표
			int y2 = Integer.parseInt(st.nextToken()); // 건물 2 y좌표
			int floor2 = Integer.parseInt(st.nextToken()); // 건물 2 층수
			int ans = floor1 + Math.abs(x1 - x2) + Math.abs(y1 - y2) + floor2; // 가야하는 거리
			sb.append(ans).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
