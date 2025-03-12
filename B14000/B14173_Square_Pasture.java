import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 겹치지 않는 두 목초지를 완벽히 둘러쌀 수 있는 최소 크기의 정사각형의 넓이를 찾는 문제
// 두 목초지의 x값과 y값의 (최대-최소)는 둘러쌀 수 있는 최소 크기의 사각형의 가로 세로
// 두 값 중에 최댓값이 위의 정사각형의 한 변의 길이
// 정사각형의 넓이 = 한 변의 길이 * 한 변의 길이
public class B14173_Square_Pasture {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int minX = Integer.MAX_VALUE; // X 최솟값
		int maxX = Integer.MIN_VALUE; // X 최댓값
		int minY = Integer.MAX_VALUE; // Y 최솟값
		int maxY = Integer.MIN_VALUE; // Y 최댓값
		for (int i = 0; i < 2; i++) { // 최대 최소 세팅
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 4; j++) {
				int tmp = Integer.parseInt(st.nextToken());
				if (j % 2 == 0) {
					minX = Math.min(minX, tmp);
					maxX = Math.max(maxX, tmp);
				} else {
					minY = Math.min(minY, tmp);
					maxY = Math.max(maxY, tmp);
				}
			}
		}
		int maxSize = Math.max(maxX - minX, maxY - minY); // 가로, 세로 중 최댓값 찾기 (정사각형의 한 변의 길이)
		System.out.println(maxSize * maxSize); // 넓이 출력
		br.close();
	}
}