import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// (0,0)부터 (N-1,N-1)값을 넣고 -> num[][]
// (0,0)부터 (i,j)까지의 사각형의 합을 구하기 -> sum[][]
// (x1,y1)부터 (x2,y2)까지의 사각형 합은
// sum[x2][y2] - sum[x2][y1 - 1] - sum[x1 - 1][y2] + sum[x1 - 1][y1 - 1]
// 단, 인덱스가 0부터 시작했기 때문에 입력 받은 x,y에 -1을 해주고 배열에 접근할 때 인덱스 범위에 주의해야 함
public class B11660_구간_합_구하기_5_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 표 크기
		int M = Integer.parseInt(st.nextToken()); // 합 출력할 개수
		int num[][] = new int[N][N]; // 숫자 표
		for (int i = 0; i < N; i++) { // input num[][]
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				num[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int sum[][] = new int[N][N]; // sum[i][j] = (0,0)부터 (i,j)까지 사각형 합(누적 합)
		// input sum[][]
		sum[0][0] = num[0][0];
		for (int i = 1; i < N; i++) {
			sum[i][0] = sum[i - 1][0] + num[i][0];
			sum[0][i] = sum[0][i - 1] + num[0][i];
		}
		for (int i = 1; i < N; i++) {
			for (int j = 1; j < N; j++) {
				sum[i][j] = sum[i][j - 1] + sum[i - 1][j] - sum[i - 1][j - 1] + num[i][j]; // 누적 합을 구하는 공식
			}
		}
		// (x1,y1)부터 (x2,y2)까지의 사각형 합 구하기
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			// 인덱스가 0부터 시작하므로 입력값에서 -1하여 저장
			int x1 = Integer.parseInt(st.nextToken()) - 1;
			int y1 = Integer.parseInt(st.nextToken()) - 1;
			int x2 = Integer.parseInt(st.nextToken()) - 1;
			int y2 = Integer.parseInt(st.nextToken()) - 1;
			// 인덱스 범위 때문에 경우를 나눔
			if (x1 == 0 && y1 == 0) {
				sb.append(sum[x2][y2]);
			} else if (x1 == 0) {
				sb.append(sum[x2][y2] - sum[x2][y1 - 1]);
			} else if (y1 == 0) {
				sb.append(sum[x2][y2] - sum[x1 - 1][y2]);
			} else {
				sb.append(sum[x2][y2] - sum[x2][y1 - 1] - sum[x1 - 1][y2] + sum[x1 - 1][y1 - 1]); // 특정 범위의 합을 구하는 공식
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();

	}
}