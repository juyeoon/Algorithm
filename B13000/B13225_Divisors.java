import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/13225
// 약수의 개수를 찾는 문제
// 제곱근까지 확인하여 약수를 구함
public class B13225_Divisors {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int C = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < C; tc++) {
			int n = Integer.parseInt(br.readLine()); // 약수를 찾을 수
			int cnt = 0; // 약수의 개수
			int sqrtN = (int) Math.sqrt(n); // 제곱근
			for (int i = 1; i <= sqrtN; i++) { // 약수 찾기
				if (n % i == 0) { // 약수
					cnt++;
					if (i != n / i) { // 중복되지 않은 페어 약수
						cnt++;
					}
				}
			}
			sb.append(n).append(" ").append(cnt).append("\n"); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
