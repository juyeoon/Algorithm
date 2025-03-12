import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 계산식으로 해결
public class B2292_벌집 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()) - 1; // 가운데가 0이라고 가정
		int layer = 1; // 층
		int layerMax = 6; // 층의 최곳값
		while (layerMax < n) { // n이 존재하는 층 계산
			layerMax += 6 * ++layer;
		}
		// 중앙의 방일 때 1 출력, 그 외 지나간 방의 최솟값 = 층 + 1
		System.out.println(n == 0 ? 1 : layer + 1);
	}
}
