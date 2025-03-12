import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Scm를 넘는 아이스크림의 최소 금액을 찾는 문제
public class B24087_アイスクリーム_Ice_Cream {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int S = Integer.parseInt(br.readLine().trim()); // 넘어야 하는 길이
		int A = Integer.parseInt(br.readLine().trim()); // 첫 아이스크림 높이
		int B = Integer.parseInt(br.readLine().trim()); // 추가 아이스크림 높이
		int cnt = 0; // 추가 아이스크림의 개수
		if (S - A > 0) { // 첫 아이스크림으로 Scm를 넘지 않는 경우에만 계산
			cnt = (S - A) / B + ((S - A) % B == 0 ? 0 : 1); // 나머지 길이를 B로 나눈 몫 + 나머지가 있으면 1 없으면 0
		}
		System.out.println(100 * cnt + 250); // 총 금액 출력
		br.close();
	}
}