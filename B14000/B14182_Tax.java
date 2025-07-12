import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/14182
// 세전 소득을 입력 받아 구간별 세율에 따라 실수령액 계산
public class B14182_Tax {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("0")) { // EOI
			int income = Integer.parseInt(s); // 세전 소득
			if (income <= 1_000_000) { // 1,000,000 이하: 세금 없음
				sb.append(income);
			} else if (income <= 5_000_000) { // 1,000,000 초과 ~ 5,000,000 이하: 10% 세금
				sb.append(income * 90 / 100);
			} else { // 5,000,000 초과: 20% 세금
				sb.append(income * 80 / 100);
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
