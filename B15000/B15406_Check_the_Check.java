import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/15406
public class B15406_Check_the_Check {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean pay = true; // 그대로 지불할지 말지(true: 지불)
		int realCost = 0; // 실제 금액
		while (true) {
			String s = br.readLine();
			if (s.equals("TOTAL")) { // 계산서 마지막
				int payCost = Integer.parseInt(br.readLine()); // 제시된 계산서 금액
				if (realCost < payCost) { // 실제 금액보다 계산서 금액이 더 크면 항의(지불 x)
					pay = false;
				}
				break;
			} else {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int pk = Integer.parseInt(st.nextToken()); // 음식 가격
				int ck = Integer.parseInt(st.nextToken()); // 주문 수량
				realCost += pk * ck; // 실제 금액에 더하기
			}
		}
		System.out.println(pay ? "PAY" : "PROTEST"); // 출력
		br.close();
	}
}
