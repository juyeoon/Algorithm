import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// (품목의 수량 * 단가)의 총 합을 출력
public class B26530_Shipping {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스
		for (int tc = 0; tc < T; tc++) {
			int N = Integer.parseInt(br.readLine()); // 품목 개수
			double sum = 0; // 총 수익
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				st.nextToken();
				sum += Double.parseDouble(st.nextToken()) * Double.parseDouble(st.nextToken()); // 품목 개수 * 단가
			}
			sb.append("$").append(String.format("%.2f\n", sum)); // 소수점 이하 두 자리까지 반올림
		}
		System.out.println(sb); // 출력
		br.close();
	}
}