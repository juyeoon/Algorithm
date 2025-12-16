import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/12539
// 월별 가격 배열을 순회하면서, 각 달을 판매 시점으로 가정
// 판매 시점 이전의 최소 가격을 구함 => 판매 이전 달만 변경된 것이기 때문에 그 달의 가격과 최소 가격을 비교해서 최소 가격 갱신
// 해당 최소 가격에 전 자금 M으로 구매 가능한 최대 수량을 계산
// (판매 가격 - 최소 가격) × 구매 수량으로 현재 시점의 총 이익을 계산
// 최대 이익을 갱신하며, 이익이 동일한 경우 더 낮은 구매 가격을 선택
public class B12539_Investing_at_the_Market_Small {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 1; tc <= T; tc++) {
			sb.append("Case #").append(tc).append(": ");
			int M = Integer.parseInt(br.readLine()); // 현재 가지고 있는 투자 자금
			int[] P = new int[13]; // 월별 상품 가격
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 1; i <= 12; i++) { // P[] 채우기
				P[i] = Integer.parseInt(st.nextToken());
			}
			int maxProfit = 0; // 최대 이익
			int purchaseIdx = 0; // 구매 월
			int salePrice = 0; // 판매 가격
			int saleIdx = 0; // 판매 월
			int minPrice = Integer.MAX_VALUE; // 현재까지의 최소 가격
			int minIdx = 0; // 현재까지의 최소 가격을 가지는 월
			for (int i = 2; i <= 12; i++) { // 각 달을 판매 시점으로 가정
				if (minPrice > P[i - 1]) { // 현재 달을 기준으로 최소 가격 설정
					minPrice = P[i - 1];
					minIdx = i - 1;
				}
				int oneProfit = P[i] - minPrice; // 한 개를 구매할 때의 가격
				int purchaseCnt = M / minPrice; // 살 수 있는 상품의 개수
				int nowProfit = oneProfit * purchaseCnt; // 현재 달에서 판매할 때 최대 이익
				if (nowProfit <= 0) { // 이익이 없으면 넘어가기
					continue;
				}
				// 최대 이익에 대한 정보를 갱신해야하는 경우
				if ((maxProfit < nowProfit) || (maxProfit == nowProfit && salePrice > minPrice)) {
					maxProfit = nowProfit;
					purchaseIdx = minIdx;
					salePrice = P[i];
					saleIdx = i;
				}
			}
			if (maxProfit <= 0) { // 이익을 얻는 것이 불가능
				sb.append("IMPOSSIBLE");
			} else {
				sb.append(purchaseIdx).append(" ").append(saleIdx).append(" ").append(maxProfit);
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
