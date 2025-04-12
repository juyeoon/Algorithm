import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/3276
// 1부터 N까지 가능한 행의 수를 시도하면서, 각 경우에 대해 필요한 열의 수를 계산하며 row + column의 합이 최소가 되는 조합 찾기
public class B3276_ICONS {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // pebble의 수
		int minSum = Integer.MAX_VALUE; // 최소 row + column 값
		int bestRows = 1; // 최적 행
		int bestCols = N; // 최적 열
		for (int rows = 1; rows <= N; rows++) { // 가능한 모든 행의 수
			int cols = (int) Math.ceil((double) N / rows); // 해당 행 수로 배치할 경우 필요한 열 수 계산
			int sum = rows + cols; // 현재 행+열의 합 계산
			if (sum < minSum) { // 더 작은 합이 발견되면 최적값 갱신
				minSum = sum;
				bestRows = rows;
				bestCols = cols;
			}
		}
		System.out.println(bestRows + " " + bestCols); // 출력
	}
}
