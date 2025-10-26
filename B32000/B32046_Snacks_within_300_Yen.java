import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/32046
public class B32046_Snacks_within_300_Yen {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("0")) { // EOI
			int n = Integer.parseInt(s); // 과자 개수
			int sum = 0; // 구매한 과자의 총 금액
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				int price = Integer.parseInt(st.nextToken()); // 과자의 가격
				// 현재까지의 합 + 이번 과자의 가격이 300엔 이하이면 장바구니에 담음
				if (sum + price <= 300) {
					sum += price;
				}
			}
			sb.append(sum).append("\n"); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
