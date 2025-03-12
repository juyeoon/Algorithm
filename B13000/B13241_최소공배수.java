import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 최소공배수 = 각 수를 최대공약수로 나눈 것을 곱하고 최대공약수 구하기
public class B13241_최소공배수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken()); // 수 A
		int B = Integer.parseInt(st.nextToken()); // 수 B
		long gcd = GCD(A, B); // 최대공약수(수 범위 주의)
		System.out.println(gcd * (A / gcd) * (B / gcd)); // 최소공배수
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
