import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// n차 다항식이 주어지고 해당 식을 미분했을 때의 최고차항의 차수와 각 항의 계수를 구하는 문제
// 미분을 하면 최고차항의 차수는 n-1이 되며
// 각 항의 계수는 계수 * 차수
public class B9299_Math_Tutoring {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) { // 테스트케이스
			sb.append("Case ").append(tc).append(": "); // 출력 형식 맞추기
			StringTokenizer st = new StringTokenizer(br.readLine());
			int e = Integer.parseInt(st.nextToken()); // 주어진 다항식의 최고차항의 차수
			sb.append(e - 1).append(" "); // 미분식의 최고차항의 차수
			for (int j = e; j >= 1; j--) { // 최고차항부터 차수가 1인 항까지 계산
				sb.append(j * Integer.parseInt(st.nextToken())).append(" "); // 차수 * 계수
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}