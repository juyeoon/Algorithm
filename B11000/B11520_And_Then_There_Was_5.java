import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Q번째 숫자는 항상 D, R번째 숫자는 항상 5이므로 테스트케이스마다 "D 5"를 출력
// https://www.acmicpc.net/problem/11520
public class B11520_And_Then_There_Was_5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int t = 0; t < N; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			st.nextToken();
			int D = Integer.parseInt(st.nextToken());
			sb.append(D).append(" 5\n"); // 출력 저장
		}
		System.out.print(sb); // 출력
		br.close();
	}
}
