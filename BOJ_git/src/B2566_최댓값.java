import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 이중 for문으로 값 하나하나 최댓값과 비교
public class B2566_최댓값 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		int maxValue = Integer.MIN_VALUE; // 최댓값
		int maxRow = 0; // 최댓값의 행
		int maxCol = 0; // 최댓값의 열
		for (int i = 1; i <= 9; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= 9; j++) {
				int num = Integer.parseInt(st.nextToken());
				if (maxValue < num) { // 현재 값이 최댓값보다 클 때
					maxValue = num; // 최댓값 갱신
					maxRow = i; // 최댓값 행 갱신
					maxCol = j; // 최댓값 열 갱신
				}
			}
		}
		System.out.println(maxValue + "\n" + maxRow + " " + maxCol); // 출력
		br.close();
	}
}
