import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://www.acmicpc.net/problem/2447
// 가운데가 빈 3*3 형태의 사각형이 반복된 형태이므로 전체를 9분할하는 과정을 반복하여 재귀 형태로 반복(분할 정복)
// 빈 부분에선 재귀 호출을 하지 않아서 공백을 만들어두는 형태로 구현
// 빈 부분을 호출하지 않고 공백을 나타내기 위해 별의 위치를 boolean 배열로 저장하여 별이 찍히는 위치는 true, 공백은 false(default)로 설정
public class B2447_별_찍기_10 {
	public static boolean[][] star; // 출력할 배열

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 전체 크기
		star = new boolean[N][N]; // 초기화
		dc(0, 0, N); // 별 찍기 시작
		for (int i = 0; i < N; i++) { // 출력 저장
			for (int j = 0; j < N; j++) {
				if (star[i][j]) {
					sb.append("*");
				} else {
					sb.append(" ");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}

	public static void dc(int x, int y, int size) { // 분할 정복으로 별 찍기
		if (size == 1) { // 별 찍을 칸이 하나면 (재귀 종료 조건)
			star[x][y] = true; // 별 찍기
			return;
		}
		int newSize = size / 3; // 9분할
		// 0행
		dc(x, y, newSize);
		dc(x, y + newSize, newSize);
		dc(x, y + newSize * 2, newSize);
		// 1행
		dc(x + newSize, y, newSize);
		// 중앙은 공백
		dc(x + newSize, y + newSize * 2, newSize);
		// 2행
		dc(x + newSize * 2, y, newSize);
		dc(x + newSize * 2, y + newSize, newSize);
		dc(x + newSize * 2, y + newSize * 2, newSize);
		return;
	}
}
