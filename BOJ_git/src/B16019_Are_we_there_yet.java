import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/16019
// 일직선 위의 연속된 도시 쌍 사이의 거리가 주어졌을 때 두 도시 사이의 거리표를 작성하는 문제
// 0에서부터 각 도시까지의 거리(즉, 좌표)를 구한 후 좌표끼리 뺀 값을 기록
public class B16019_Are_we_there_yet {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = 4; // 도시 4개
		int city[] = new int[N + 1]; // 도시의 좌표
		for (int i = 1; i <= N; i++) { // city[] 구하기
			city[i] = city[i - 1] + Integer.parseInt(st.nextToken());
		}
		int dis[][] = new int[N + 1][N + 1]; // 도시 사이의 거리표
		for (int i = 0; i < N; i++) { // 거리표 채우기
			for (int j = i + 1; j <= N; j++) {
				int tmp = city[j] - city[i]; // 두 도시 사이의 거리
				dis[i][j] = tmp; // 거리표에 기록
				dis[j][i] = tmp;
			}
		}
		for (int i = 0; i <= N; i++) { // 출력 저장
			for (int j = 0; j <= N; j++) {
				sb.append(dis[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
