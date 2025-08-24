import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/14545
// 한 변의 길이가 k인 정사각형은 (l−k+1)×(l−k+1) = (l−k+1)^2개
// 따라서 전체 개수는 Σ[k=1..l] (l−k+1)^2 = Σ[i=1..l] i^2
// 합공식으로 Σ[i=1..l] i^2 = l(l+1)(2l+1)/6
// 곱을 먼저 하면 중간 곱이 커지므로 6 = 2*3을 이용하여 2와 3으로 나눈 값을 곱함
public class B14545_Square {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int P = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 1; tc <= P; tc++) {
			long l = Long.parseLong(br.readLine()); // 격자 사각형의 길이
			long a = l; // 분자 1
			long b = l + 1; // 분자 2
			long c = 2 * l + 1; // 분자 3
			// 6으로 약분
			if (a % 2 == 0) {
				a /= 2;
			} else {
				b /= 2;
			}
			if (a % 3 == 0) {
				a /= 3;
			} else if (b % 3 == 0) {
				b /= 3;
			} else {
				c /= 3;
			}
			sb.append(a * b * c).append("\n"); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
