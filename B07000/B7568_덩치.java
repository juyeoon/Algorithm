import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// i(행)가 j(열) 보다 덩치가 클 때 big[i][j] = true
// 덩치 등수 규칙에 따라서 한 열에 true 개수가 몇 개인지 세기
public class B7568_덩치 {
	static int N; // 사람 수
	static int[] arr = new int[2]; // 조합 결과
	static boolean[][] big; // 덩치 비교 결과
	static int[][] input; // 키 몸무게 input

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(br.readLine());
		input = new int[N][2];
		big = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			String s[] = br.readLine().split(" ");
			input[i][0] = Integer.parseInt(s[0]);
			input[i][1] = Integer.parseInt(s[1]);
		} // input
		comb(0, 0); // 크기 비교할 2명 선택 및 덩치 비교
		for (int i = 0; i < N; i++) { // 덩치 등수 계산(한 열에 true가 몇 개인지 확인)
			int cnt = 1; // 더 덩치가 큰 사람이 k명일 때 등수는 k+1이기 때문에 1부터 시작
			for (int j = 0; j < N; j++) {
				if (big[j][i])
					cnt++;
			}
			sb.append(cnt).append(" ");
		}
		System.out.println(sb);
		br.close();
	}

	// 크기 비교할 2명 선택 및 덩치 비교
	public static void comb(int cnt, int start) {
		if (cnt == 2) { // 선택(조합) 끝
			int x = input[arr[0]][0];
			int y = input[arr[0]][1];
			int p = input[arr[1]][0];
			int q = input[arr[1]][1];
			if (x > p && y > q) // arr[0]이 arr[1] 보다 덩치가 크다
				big[arr[0]][arr[1]] = true;
			else if (p > x && q > y) // arr[1]이 arr[0] 보다 덩치가 크다
				big[arr[1]][arr[0]] = true;
			return;
		}
		for (int i = start; i < N; i++) { // 조합
			arr[cnt] = i;
			comb(cnt + 1, i + 1);
		}

	}
}
