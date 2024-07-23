import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 등차수열로 쌓여있는 쿠키의 합 구하기
public class B30143_Cookie_Piles {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); // 항 개수
			int A = Integer.parseInt(st.nextToken()); // 첫 항의 값
			int D = Integer.parseInt(st.nextToken()); // 등차
			sb.append(N * (2 * A + (N - 1) * D) / 2).append("\n"); // 출력값 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
