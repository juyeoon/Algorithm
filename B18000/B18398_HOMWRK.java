import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 테스트케이스 당 문제 개수 당 숫자의 덧셈과 곱셈을 출력
public class B18398_HOMWRK {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			int N = Integer.parseInt(br.readLine()); // 문제 개수
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				int A = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());
				sb.append(A + B).append(" ").append(A * B).append("\n"); // 덧셈 곱셈 출력
			}
		}
		System.out.println(sb);
		br.close();
	}
}