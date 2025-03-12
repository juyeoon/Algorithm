import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 수수료는 100 이상 2000 이하
// 수수료는 25.0(기본 수수료) + 송금액 * 0.01
public class B21633_Bank_Transfer {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine()); // 송금액
		double ans = 25 + k * 0.01; // 수수료
		if (ans < 100) { // 수수료가 100 이하이면
			System.out.println("100.00"); // 100 출력
		} else if (ans > 2000) { // 수수료가 2000 이상이면
			System.out.println("2000.00"); // 2000 출력
		} else { // 그 외
			System.out.println(String.format("%.2f", ans)); // 수수료 출력
		}
		br.close();
	}
}