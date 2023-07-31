import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 최소공배수 => a * b / 최대공약수
// 최대공약수 => 유클리드 호제법으로 구하기
public class B2702_초6_수학 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()); // a
			int b = Integer.parseInt(st.nextToken()); // b
			int gcd = 0; // 최대공약수 
			if (a > b) { // 유클리드 호제법 활용을 위해 크기 비교
				gcd = GCD(a, b);
			} else {
				gcd = GCD(b, a);
			}
			sb.append(a * b / gcd).append(" ").append(gcd).append("\n"); // 최소공배수 최대공약수 출력
		}
		System.out.println(sb); // 출력
		br.close();
	}

	private static int GCD(int a, int b) { // 유클리드 호제법으로 최대공약수 구하기
		while (b != 0) {
			int tmp = b;
			b = a % b;
			a = tmp;
		}
		return a;
	}
}