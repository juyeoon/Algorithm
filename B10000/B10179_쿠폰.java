import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 20% 할인 쿠폰을 적용하면 원가 * (80/100)
public class B10179_쿠폰 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스
		for (int tc = 1; tc <= T; tc++) {
			double value = Double.parseDouble(br.readLine()); // 원가
			sb.append("$").append(String.format("%.2f", value / 100 * 80)).append("\n"); // 할인된 가격
		}
		System.out.println(sb); // 출력
		br.close();
	}
}