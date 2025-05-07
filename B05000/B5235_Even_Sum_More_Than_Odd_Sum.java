import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/5235
// 수열이 주어졌을 때 홀수의 합이 큰지 짝수의 합이 큰지 출력하는 문제
// 수의 크기가 작기 때문에 단순 구현 문제
public class B5235_Even_Sum_More_Than_Odd_Sum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int odd = 0; // 홀수의 합
			int even = 0; // 짝수의 합
			int k = Integer.parseInt(st.nextToken()); // 항의 개수
			for (int i = 0; i < k; i++) {
				int n = Integer.parseInt(st.nextToken());
				if (n % 2 == 0) { // 짝수
					even += n;
				} else { // 홀수
					odd += n;
				}
			}
			if (odd > even) { // 홀수 합이 더 큼
				sb.append("ODD");
			} else if (odd < even) { // 짝수 합이 더 큼
				sb.append("EVEN");
			} else { // 같음
				sb.append("TIE");
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
