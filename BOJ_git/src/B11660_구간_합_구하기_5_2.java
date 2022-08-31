import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Short coding 버전
// 배열의 크기를 [N+1][N+1]로 잡으면 인덱스 범위가 넘어가는 것을 신경 안 써도 됨(default가 0이기 때문)
public class B11660_구간_합_구하기_5_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 표 크기
		int M = Integer.parseInt(st.nextToken());// 합 출력할 개수
		int num[][] = new int[N + 1][N + 1];// 숫자 표
		for (int i = 1; i <= N; i++) {// input num[][]
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				num[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int sum[][] = new int[N + 1][N + 1]; // sum[i][j] = (1,1)부터 (i,j)까지 사각형 합(누적 합)
		// input sum[][]
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				sum[i][j] = sum[i][j - 1] + sum[i - 1][j] - sum[i - 1][j - 1] + num[i][j];// 누적 합을 구하는 공식
			}
		}
		// (x1,y1)부터 (x2,y2)까지의 사각형 합 구하기
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			sb.append(sum[x2][y2] - sum[x2][y1 - 1] - sum[x1 - 1][y2] + sum[x1 - 1][y1 - 1]).append("\n");// 특정 범위의 합을
																											// 구하는 공식
		}
		System.out.println(sb); // 출력
		br.close();

	}
}