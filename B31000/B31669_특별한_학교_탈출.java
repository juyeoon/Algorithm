import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/31669
// 선생님당 교시별 순찰 여부를 2차원 배열에 저장 후 열 단위로 확인
// 해당 열에 'X'만 있으면 탈출 가능, 해당 열 출력 (1부터 시작)
public class B31669_특별한_학교_탈출 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 선생님의 수
		int M = Integer.parseInt(st.nextToken()); // 교시
		char c[][] = new char[N][M]; // 순찰 여부
		for (int i = 0; i < N; i++) { // c[][] 채우기
			c[i] = br.readLine().toCharArray();
		}
		boolean can = false; // 탈출 가능
		int ans = 0; // 탈출 가능 교시
		for (int j = 0; j < M; j++) { // 세로로 확인
			boolean o = false; // 해당 열에 O가 있는지
			for (int i = 0; i < N; i++) { // 열 확인
				if (c[i][j] == 'O') {
					o = true;
					break;
				}
			}
			if (!o) { // O가 없으면 탈출 가능
				can = true;
				ans = j + 1;
				break;
			}
		}
		System.out.println(can ? ans : "ESCAPE FAILED"); // 출력
		br.close();
	}
}
