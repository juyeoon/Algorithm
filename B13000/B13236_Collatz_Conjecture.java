import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/13236
// N이 1이 될 때까지 조건에 따라서 연산
public class B13236_Collatz_Conjecture {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 입력 정수
		sb.append(N).append(" ");
		while (N != 1) { // N == 1까지 반복
			if (N % 2 == 0) { // 짝수
				N /= 2;
			} else { // 홀수
				N = N * 3 + 1;
			}
			sb.append(N).append(" ");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
