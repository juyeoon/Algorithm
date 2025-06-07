import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/14039
// 4x4 배열에 입력 숫자를 저장한 후 
// 0행의 합을 기준값으로 두고 1~3행의 합, 0~3열의 합을 확인하고 하나라도 다르면 not magic
// 모두 같으면 magic
public class B14039_Magic_Squares {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int square[][] = new int[4][4]; // 4x4 크기의 숫자 정사각형
		for (int i = 0; i < 4; i++) { // square[][] 채우기
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 4; j++) {
				square[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		System.out.println(magicSquare(square) ? "magic" : "not magic"); // 출력
		br.close();
	}

	public static boolean magicSquare(int[][] square) { // Magic Square인지 확인
		int sum = square[0][0] + square[0][1] + square[0][2] + square[0][3]; // 0행의 합(기준)
		for (int i = 1; i < 4; i++) { // 행의 합 확인하기
			if (sum != square[i][0] + square[i][1] + square[i][2] + square[i][3]) { // 기준과 다르면
				return false;
			}
		}
		for (int j = 0; j < 4; j++) { // 열의 합 확인하기
			if (sum != square[0][j] + square[1][j] + square[2][j] + square[3][j]) { // 기준과 다르면
				return false;
			}
		}
		return true;
	}
}
