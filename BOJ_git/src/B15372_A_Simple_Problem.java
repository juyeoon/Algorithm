import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// N을 제곱하여 출력하는 문제
// N의 범위가 200000이기 때문에 제곱하면 int의 범위를 벗어남 => long 필요
public class B15372_A_Simple_Problem {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스
		for (int i = 0; i < T; i++) {
			long N = Long.parseLong(br.readLine()); // 주어진 수
			sb.append(N * N).append("\n"); // 제곱
		}
		System.out.println(sb); // 출력
		br.close();
	}
}