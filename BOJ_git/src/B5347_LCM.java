import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 유클리드 호제법으로 최대공약수를 구한 후, 각각의 수를 최대공약수로 나눈 수들을 최대공약수에 곱하여 최소공배수를 구함
public class B5347_LCM {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()); // 수 a
			int b = Integer.parseInt(st.nextToken()); // 수 b
			int gcd = GCD(a, b); // 최대공약수
			sb.append(gcd * (a / gcd) * (b / gcd)).append("\n"); // sb에 최소공배수 추가
		}
		System.out.println(sb); // 출력
		br.close();
	}

	// 유클리드 호제법으로 최대공약수 구하기
	public static int GCD(int a, int b) {
		if (a % b == 0) {
			return b;
		}
		return GCD(b, a % b);
	}

}
