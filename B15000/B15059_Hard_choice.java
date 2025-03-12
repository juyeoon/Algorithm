import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 메뉴 별로 필요한 양에서 준비된 양을 뺀 후 뺀 값이 양수면 정답에 더하기
public class B15059_Hard_choice {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ready[] = br.readLine().split(" "); // 준비된 양
		String needs[] = br.readLine().split(" "); // 주문한 양, 필요한 양
		int ans = 0; // 정답
		for (int i = 0; i < 3; i++) {
			int dif = Integer.parseInt(needs[i]) - Integer.parseInt(ready[i]); // 필요한 양 - 준비된 양
			if (dif > 0) { // 준비된 양이 부족하면
				ans += dif; // 정답에 부족한 양 만큼 더하기
			}
		}
		System.out.println(ans); // 정답 출력
		br.close();
	}
}