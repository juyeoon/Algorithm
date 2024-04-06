import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 농구 선수의 기록이 주어지면 10 이상인 항목이 몇개인지에 따라 다르게 출력하는 문제
// 항목이 10 이상인지 여부를 boolean 배열에 저장(true: 10 이상)
// 세 항목이 10 이상 => 전부 AND 했을 때 true
// 두 항목이 10 이상 => 전부 XOR 했을 때 false
// 한 항목이 10 이상 => 전부 XOR 했을 때 true
// 전부 10보다 작음 => 전부 OR 했을 때 false
public class B25893_Majestic_10 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine().trim()); // 플레이어 수
		for (int tc = 0; tc < n; tc++) {
			String s = br.readLine(); // 선수의 통계
			sb.append(s).append("\n");
			String value[] = s.split(" ");
			boolean bigTen[] = new boolean[3]; // 10 이상 여부 확인(true: 10 이상)
			for (int i = 0; i < 3; i++) { // bigTen[] 값 저장
				if (Integer.parseInt(value[i]) >= 10) {
					bigTen[i] = true;
				}
			}
			if (bigTen[0] & bigTen[1] & bigTen[2]) { // 모두 10 이상
				sb.append("triple-double");
			} else if (bigTen[0] ^ bigTen[1] ^ bigTen[2]) { // 하나만 10 이상
				sb.append("double");
			} else if (!(bigTen[0] | bigTen[1] | bigTen[2])) { // 모두 10 이상이 아님
				sb.append("zilch");
			} else { // 두 개만 10 이상
				sb.append("double-double");
			}
			sb.append("\n\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}