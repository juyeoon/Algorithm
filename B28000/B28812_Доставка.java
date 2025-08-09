import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/28812
// 총 비용 = (모델 가격 + 배송 기본 비용 + 배송 연료량 * 연료 리터당 가격)
public class B28812_Доставка {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 상점 개수
		int C = Integer.parseInt(st.nextToken()); // 연료 리터당 가격
		int minCost = Integer.MAX_VALUE; // 최소 비용
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken()); // 모델 가격
			int d = Integer.parseInt(st.nextToken()); // 배송 기본 비용
			int v = Integer.parseInt(st.nextToken()); // 배송에 필요한 연료량
			int totalCost = p + d + (v * C); // 총 비용 계산
			if (totalCost < minCost) {
				minCost = totalCost; // 최소값 갱신
			}
		}
		System.out.println(minCost); // 출력
		br.close();
	}
}
