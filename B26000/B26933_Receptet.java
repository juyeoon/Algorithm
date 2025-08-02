import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/26933
// 추가로 구매하는 양에 대한 금액 = (총 필요한 양 - 집에 이미 있는 양) * 부족한 양을 살 경우의 단가
public class B26933_Receptet {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int totalCost = 0; // 요리를 하기 위한 총 비용
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken()); // 집에 이미 있는 양
			int B = Integer.parseInt(st.nextToken()); // 총 필요한 양
			int K = Integer.parseInt(st.nextToken()); // 부족한 양을 살 경우의 단가
			int addCost = (B - H) * K; // 추가 구매시 금액
			if (addCost > 0) { // 추가 금액이 양수면 구매
				totalCost += addCost;
			}
		}
		System.out.println(totalCost); // 출력
		br.close();
	}
}
