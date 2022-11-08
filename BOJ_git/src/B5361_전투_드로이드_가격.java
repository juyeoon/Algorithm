import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 각 부품의 가격을 배열에 저장한 후 반복문으로 개수 * 가격의 합을 구함
public class B5361_전투_드로이드_가격 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		double price[] = { 350.34, 230.90, 190.55, 125.30, 180.90 }; // 각 부품의 가격
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			double ans = 0; // 총 가격
			for (int i = 0; i < 5; i++) {
				ans += Integer.parseInt(st.nextToken()) * price[i]; // 필요 부품 개수 * 가격
			}
			sb.append("$").append(String.format("%.2f", ans)).append("\n"); // 소수점 둘째자리까지 반올림
		}
		System.out.println(sb); // 출력
		br.close();
	}
}