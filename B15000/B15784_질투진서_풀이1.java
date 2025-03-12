import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 풀이 1: 진서의 자리를 기준으로 사방(상좌하우)탐색
public class B15784_질투진서_풀이1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // N행 N열
		int a = Integer.parseInt(st.nextToken()); // 진서 자리(a, b)
		int b = Integer.parseInt(st.nextToken());
		int[][] chair = new int[N + 1][N + 1]; // 매력 지수 배열
		for (int i = 1; i <= N; i++) { // chair[][] 채우기
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				chair[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		boolean angry = false; // 더 잘생긴 사람 존재 여부(true: 존재)
		int[] dx = { 0, -1, 0, 1 }; // 상좌하우 x
		int[] dy = { -1, 0, 1, 0 }; // 상좌하우 y
		Loop: for (int k = 0; k < 4; k++) { // dx[], dy[] 인덱스
			int nowX = a + dx[k]; // 확인할 현재 자리 x
			int nowY = b + dy[k]; // 확인할 현재 자리 y
			while (nowX > 0 && nowY > 0 && nowX <= N && nowY <= N) { // 배열 인덱스 범위
				if (chair[nowX][nowY] > chair[a][b]) { // 매력지수가 더 높은 사람이 있으면
					angry = true;
					break Loop; // 더 이상 확인 안 함
				}
				nowX += dx[k]; // 현재 자리 갱신
				nowY += dy[k]; // 현재 자리 갱신
			}
		}
		System.out.println(angry ? "ANGRY" : "HAPPY"); // 출력
		br.close();
	}
}