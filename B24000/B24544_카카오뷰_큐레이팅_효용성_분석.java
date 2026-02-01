import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24544 - 카카오뷰 큐레이팅 효용성 분석
// https://www.acmicpc.net/problem/24544
public class B24544_카카오뷰_큐레이팅_효용성_분석 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[2][N];
		for (int i = 0; i < 2; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int allSum = 0;
		int noSum = 0;
		for (int i = 0; i < N; i++) {
			allSum += arr[0][i];
			if (arr[1][i] == 0) {
				noSum += arr[0][i];
			}
		}
		System.out.println(allSum);
		System.out.println(noSum);
		br.close();
	}
}
