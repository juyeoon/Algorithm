import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/32682
// 홀수 => N % 2 == 1
// 완전제곱수 => ((int) Math.sqrt(N)) * ((int) Math.sqrt(N)) == N
public class B32682_Which_Number_Kind_Is_It {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			int N = Integer.parseInt(br.readLine()); // 입력 받은 수
			int sqrt = (int) Math.sqrt(N); // 제곱근
			if (N % 2 == 1) { // 홀수
				if (sqrt * sqrt == N) { // 완전제곱수
					sb.append("OS");
				} else {
					sb.append("O");
				}
			} else { // 짝수
				if (sqrt * sqrt == N) {
					sb.append("S");
				} else {
					sb.append("EMPTY");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
