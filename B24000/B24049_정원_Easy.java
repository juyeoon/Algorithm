import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/24049
// 현재 칸의 위쪽과 왼쪽의 꽃 색은 두 꽃의 색이 같다면 노란색 꽃, 다르다면 빨간색 꽃 => XOR 연산
public class B24049_정원_Easy {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 정원의 세로 길이
		int M = Integer.parseInt(st.nextToken()); // 정원의 가로 길이
		boolean[][] flower = new boolean[N + 1][M + 1]; // 정원
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) { // 정원의 왼쪽 가장자리 꽃
			int color = Integer.parseInt(st.nextToken());
			flower[i][0] = (color == 1 ? true : false);
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= M; i++) { // 정원의 위쪽 가장자리 꽃
			int color = Integer.parseInt(st.nextToken());
			flower[0][i] = (color == 1 ? true : false);
		}
		// 정원에 꽃 재우기
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				flower[i][j] = flower[i - 1][j] ^ flower[i][j - 1];
			}
		}
		System.out.println(flower[N][M] ? 1 : 0); // 마지막 꽃 색 출력
		br.close();
	}
}
