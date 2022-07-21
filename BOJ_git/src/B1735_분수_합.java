import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1735 - 분수 합
public class B1735_분수_합 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		// A분자 A분모
		// B분자 B분모
		int num[][] = new int[2][2];
		for (int i = 0; i < 2; i++) { // input
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 2; j++) {
				num[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int deno = num[0][1] * num[1][1]; // 두 분수의 분모의 곱
		int numer = (num[0][0] * num[1][1]) + (num[1][0] * num[0][1]); // 두 분수의 합의 분자
		// 합을 기약분수로 만들기
		int gcd = GCD(deno, numer); // 합의 분모와 분자의 최대공약수
		System.out.println((numer / gcd) + " " + (deno / gcd)); // 기약분수 출력
	}

	// 유클리드 호제법으로 최대공약수 구하기
	public static int GCD(int a, int b) {
		if (a % b == 0) {
			return b;
		}
		return GCD(b, a % b);
	}
}
