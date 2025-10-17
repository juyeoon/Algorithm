import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/23055
// x는 상하 대칭이므로 반만큼만 반복하여 한 번에 상하를 표기
// x의 대각선은 두 위치가 합쳐져 N-1이므로 i와 N-1-i로 표기
public class B23055_공사장_표지판 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 표지판 크기
		boolean[][] ans = new boolean[N][N]; // 표지판 모양
		for (int i = 0; i < N; i++) { // 맨 위, 맨 아래 한 줄
			ans[0][i] = true;
			ans[N - 1][i] = true;
		}
		for (int i = 1; i <= (N - 1) / 2; i++) { // 상하 대칭이므로 반만큼만 반복
			// 위쪽
			ans[i][0] = true; // 맨 왼쪽
			ans[i][N - 1] = true; // 맨 오른쪽
			ans[i][i] = true; // x의 좌 대각선
			ans[i][N - 1 - i] = true; // x의 우 대각선
			// 아래쪽
			ans[N - 1 - i][0] = true; // 맨 왼쪽
			ans[N - 1 - i][N - 1] = true; // 맨 오른쪽
			ans[N - 1 - i][i] = true; // x의 좌 대각선
			ans[N - 1 - i][N - 1 - i] = true; // x의 우 대각선

		}
		for (boolean[] bs : ans) { // 출력 저장
			for (boolean bs2 : bs) {
				sb.append(bs2 ? "*" : " ");
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
