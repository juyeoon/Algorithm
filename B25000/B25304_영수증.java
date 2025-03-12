import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 단순 계산
public class B25304_영수증 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int X = Integer.parseInt(br.readLine()); // 영수증에 적힌 금액
		int N = Integer.parseInt(br.readLine()); // 구매한 물건의 종류의 수
		int sum = 0; // 가격과 개수로 계산한 총 금액
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			sum += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()); // 가격 * 개수
		}
		System.out.println(X == sum ? "Yes" : "No"); // 계산 금액과 총 금액이 같으면 Yes 아니면 No
		br.close();
	}
}
