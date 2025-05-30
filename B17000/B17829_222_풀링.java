import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/17829
// 재귀를 활용하여 기존 행렬을 2번째로 큰 수만 남기는 행렬로 바꾸어 가며 행렬의 크기가 1이 될 때까지 반복
public class B17829_222_풀링 {
	public static int[][] matrix; // 계산한 행렬

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 행렬 크기
		matrix = new int[N][N]; // 행렬 초기화
		for (int i = 0; i < N; i++) { // matrix[][] 채우기
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				matrix[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		makehalfMatrix(N); // 222-풀링 적용
		System.out.println(matrix[0][0]); // 하나만 남은 수 출력
		br.close();
	}

	public static void makehalfMatrix(int N) { // 222-풀링
		if (N == 1) { // 재귀 종료 조건
			return;
		}
		int newMatrix[][] = new int[N / 2][N / 2]; // 2번째로 큰 수만 남긴 행렬
		for (int i = 0; i < N; i += 2) { // 행
			for (int j = 0; j < N; j += 2) { // 열
				int sortArr[] = new int[4]; // 2번째로 큰 수를 확인하기 위한 배열
				sortArr[0] = matrix[i][j];
				sortArr[1] = matrix[i][j + 1];
				sortArr[2] = matrix[i + 1][j];
				sortArr[3] = matrix[i + 1][j + 1];
				Arrays.sort(sortArr); // 2x2 행렬 정렬
				newMatrix[i / 2][j / 2] = sortArr[2]; // 새로운 행렬에 2번째로 큰 수 입력
			}
		}
		matrix = newMatrix; // 기존 행렬을 새로운 행렬로 교체
		makehalfMatrix(N / 2); // 222-풀링(재귀)
		return;
	}
}
