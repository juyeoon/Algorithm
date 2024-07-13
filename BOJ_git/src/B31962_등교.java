import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 버스 출발 시각(S) + 버스가 가는 시간(T)이 도착해야하는 시간(X)이하일 때 그 버스를 탈 수 있음
public class B31962_등교 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 버스 개수
		int X = Integer.parseInt(st.nextToken()); // 도착해야 하는 시간
		int maxS = -1; // 가장 늦게 출발하는 버스 시각
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int S = Integer.parseInt(st.nextToken()); // 버스 출발 시각
			int T = Integer.parseInt(st.nextToken()); // 버스가 학교까지 가는 시간
			// 버스 출발 시각 + 버스가 가는 시간이 X이하일 때 그 버스를 탈 수 있음
			// 현재까지의 가장 늦게 출발하는 버스보다 출발시각이 더 늦으면
			if (S + T <= X && maxS < S) {
				maxS = S; // 출발 버스 시각 갱신
			}
		}
		System.out.println(maxS); // 출력
		br.close();
	}
}
