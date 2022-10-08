import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 거스름돈에서 단위가 큰 단위부터 최대한으로 뺀 다음 단위를 최대한으로 빼는 것을 반복(그리디)
public class B2720_세탁소_사장_동혁 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int money[] = { 25, 10, 5, 1 }; // 단위
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			int change = Integer.parseInt(br.readLine()); // 거스름돈
			for (int i = 0; i < 4; i++) { // 단위 종류만큼 반복
				int cnt = change / money[i]; // 한 단위의 개수
				sb.append(cnt).append(" "); // sb에 저장
				change -= cnt * money[i]; // 개수 * 단위만큼 거스름돈에서 빼기
			}
			sb.append("\n"); // 테스트케이스 분리
		}
		System.out.println(sb); // 출력
		br.close();
	}
}