import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 파리의 총 이동 거리 = 파리의 이동 시간 * 파리의 속력
// = (기차가 부딪힐 때까지의 시간) * 파리의 속력
// = (철로의 길이 / (기차 A의 속도 + 기차 B의 속도)) * 파리의 속력
public class B9469_폰_노이만 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			double D = Double.parseDouble(st.nextToken()); // 철로의 길이
			double A = Double.parseDouble(st.nextToken()); // 기차 A의 속도
			double B = Double.parseDouble(st.nextToken()); // 기차 B의 속도
			double F = Double.parseDouble(st.nextToken()); // 파리 F의 속도
			double flyTime = D / (A + B); // 파리 이동 시간
			sb.append(tc).append(" ").append(String.format("%.6f", flyTime * F)).append("\n"); // 파리의 이동 거리
		}
		System.out.println(sb); // 출력
		br.close();
	}
}