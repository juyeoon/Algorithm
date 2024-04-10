import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 동전의 금액이 오름차순으로 주어졌을 때 정렬된 순서로 각 동전이 이전 동전 금액의 최소 두 배 이상인지 확인하는 문제
// 이전 동전 금액을 저장하고 현재 동전의 2배 금액과 비교한 후 이전 금액을 갱신하는 작업을 반복
public class B26350_Good_Coin_Denomination {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 데이터 세트 개수
		for (int tc = 0; tc < T; tc++) {
			sb.append("Denominations: ");
			String s[] = br.readLine().split(" ");
			int n = Integer.parseInt(s[0]); // 동전 금액 개수
			boolean good = true; // 바람직한 속성인지 여부(true: 바람직)
			int pre = Integer.parseInt(s[1]); // 이전 동전 금액
			for (int i = 2; i <= n; i++) {
				int now = Integer.parseInt(s[i]); // 현재 동전 금액
				if (pre * 2 > now) { // 현재 동전 금액이 이전 동전 금액의 2배보다 작을 때
					good = false; // 바람직하지 못한 속성
					break;
				}
				pre = now; // 이전 동전 금액 갱신
			}
			for (int i = 1; i <= n; i++) { // 출력 형식 맞추기
				sb.append(s[i]).append(" ");
			}
			sb.append(good ? "\nGood coin denominations!\n\n" : "\nBad coin denominations!\n\n"); // 출력 결과 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}