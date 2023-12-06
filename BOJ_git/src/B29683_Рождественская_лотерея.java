import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 발행 티켓 장수 = (수표의 총 구매 비용 / 티켓 한 장을 받으려면 지출해야 하는 루블의 양)의 합
public class B29683_Рождественская_лотерея {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]); // 수표 개수
		int A = Integer.parseInt(s[1]); // 티켓 한 장을 받으려면 지출해야 하는 루블의 양
		int ans = 0; // 발행 티켓 장수
		s = br.readLine().split(" "); // 각 수표의 총 구매 비용
		for (int i = 0; i < N; i++) {
			ans += Integer.parseInt(s[i]) / A; // (수표의 총 구매 비용 / 티켓 한 장을 받으려면 지출해야 하는 루블의 양)
		}
		System.out.println(ans); // 출력
		br.close();
	}
}