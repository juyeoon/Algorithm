import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/26548
// 이차방적식의 계수가 얼만지 주어지고 근의 공식을 활용하여 두 근을 구하는 문제
public class B26548_Quadratics {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine().trim()); // 테스트케이스
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			double a = Double.parseDouble(st.nextToken()); // a
			double b = Double.parseDouble(st.nextToken()); // b
			double c = Double.parseDouble(st.nextToken()); // c
			double val1 = ((-1 * b) + Math.sqrt(b * b - 4 * a * c)) / (2 * a); // 근 (큰 값)
			double val2 = ((-1 * b) - Math.sqrt(b * b - 4 * a * c)) / (2 * a); // 근 (작은 값)
			sb.append(String.format("%.3f, %.3f\n", val1, val2)); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
