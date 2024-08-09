import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 기존 계좌에 입금과 출금을 했을 때의 잔액을 출력하는 문제
// 입금이면 두 값을 더하여 출력
// 출금이면 두 값을 빼서 출력
// 출금 했을 때 -200 이하면 Not allowed 출력
public class B2975_Transactions {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String s = "";
		while (!(s = br.readLine()).equals("0 W 0")) { // EOI
			st = new StringTokenizer(s);
			int a = Integer.parseInt(st.nextToken()); // 초기값
			char c = st.nextToken().charAt(0); // 입금 or 출금
			int b = Integer.parseInt(st.nextToken()); // 금액
			if (c == 'D') { // 입금
				sb.append(a + b); // 초기값 + 입금액
			} else { // 출금
				// 초기값 - 출금액이 -200보다 크면 초기값 - 출금액, 아니면 Not allowed
				sb.append((a - b < -200) ? "Not allowed" : a - b);
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
