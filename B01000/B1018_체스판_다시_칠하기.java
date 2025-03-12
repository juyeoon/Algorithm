import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1018_체스판_다시_칠하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]); // 행
		int M = Integer.parseInt(s[1]); // 열
		char chess[][] = new char[N][M]; // 체스판 배열
		for (int i = 0; i < N; i++) {
			chess[i] = br.readLine().toCharArray();
		} // input
		int min = Integer.MAX_VALUE; // 바꿔야 하는 체스판 수의 최소값
		for (int i = 0; i <= N - 8; i++) {
			for (int j = 0; j <= M - 8; j++) { // 전체 체스판 배열 순회
				int minW = 0; // 왼쪽 위가 흰색으로 시작할 때 바꿔야 하는 체스판 수의 최소값
				for (int r = i; r < i + 8; r++) { // 8X8 부분 순회
					for (int c = j; c < j + 8; c++) {
						// 색을 바꿔야 할 조건
						// 행 인덱스와 열 인덱스의 합이 홀수이고 체스판 색이 흰색일 때
						// 행 인덱스와 열 인덱스의 합이 짝수이고 체스판 색이 검은색일 때
						if ((chess[r][c] == 'W' && (r + c) % 2 != 0) || (chess[r][c] == 'B' && (r + c) % 2 == 0)) {
							minW++;
						}
					}
				}
				// Math.min(minW, 64 - minW): 흰색으로 시작할 때 바꿔야 하는 체스판 수의 최소값, 검은색으로 시작할 때 바꿔야 하는 체스판 수의 최소값
				min = Math.min(min, Math.min(minW, 64 - minW));
			}
		}
		System.out.println(min);
		br.close();
	}
}