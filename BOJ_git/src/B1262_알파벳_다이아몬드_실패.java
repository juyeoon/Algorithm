import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 메모리 초과
public class B1262_알파벳_다이아몬드_실패 {
	public static int di[] = { 1, 1, -1, -1 }; // 좌하, 우하, 우상, 좌상
	public static int dj[] = { -1, 1, 1, -1 };

	public static char tile[][]; // 하나의 타일
	public static int N, R1, C1, R2, C2;
	public static int wh, height, width;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");

		N = Integer.parseInt(input[0]); // 타일에 들어가는 알파벳 종류
		R1 = Integer.parseInt(input[1]); // 시작점 x
		C1 = Integer.parseInt(input[2]); // 시작점 y
		R2 = Integer.parseInt(input[3]); // 끝점 x
		C2 = Integer.parseInt(input[4]); // 끝점 y

		wh = 2 * N - 1; // 하나의 타일 가로 세로
		height = R2 - R1 + 1; // 전체 벽 높이
		width = C2 - C1 + 1; // 전체 벽 폭

		tile = new char[wh][wh]; // 하나의 타일
		for (char c[] : tile) { // 전부 .으로 채우기
			Arrays.fill(c, '.');
		}

		// tile 만들기
		makeTile();

		// tile 붙이기
		attachTile();

		// 출력
		System.out.println(sb);
		br.close();
	}

	// tile 만들기 - 반복문으로 타일 만들기
	public static void makeTile() {
		char alpha = 'a';
		tile[N - 1][N - 1] = alpha++; // 타일의 중앙
		for (int k = 2; k <= N; k++) {
			int dir = 0; // 방향을 결정하는 idx
			int i = N - k; // 확인할 위치(행)
			int j = N - 1; // 확인할 위치(열)
			do { // 좌하
				tile[i][j] = alpha;
				i += di[dir];
				j += dj[dir];
			} while (i < N - 1);
			dir++;
			do { // 우하
				tile[i][j] = alpha;
				i += di[dir];
				j += dj[dir];
			} while (j < N - 1);
			dir++;
			do { // 우상
				tile[i][j] = alpha;
				i += di[dir];
				j += dj[dir];
			} while (i > N - 1);
			dir++;
			do { // 좌상
				tile[i][j] = alpha;
				i += di[dir];
				j += dj[dir];
			} while (j > N - 1);
			alpha++;
			// 알파벳 개수보다 크면 다시 a로 돌려주기
			if (alpha == 122)
				alpha = 97;
		}
	}

	// tile 붙이기 - 하나의 타일을 반복해서 돌기
	public static void attachTile() {
		int i = R1 % wh; // 행 시작점
		for (int a = 0; a < height; a++) { // 행 반복
			int j = C1 % wh; // 열 시작점
			for (int b = 0; b < width; b++) { // 열 반복
				sb.append(tile[i][j]);
				if (++j == wh) {
					j = 0;
				}
			}
			sb.append("\n");
			if (++i == wh) {
				i = 0;
			}
		}
	}
}
