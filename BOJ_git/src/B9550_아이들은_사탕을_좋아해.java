import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 각 (종류의 사탕 수 / 최소 사탕 개수(K))의 합
public class B9550_아이들은_사탕을_좋아해 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); // 사탕 종류
			int K = Integer.parseInt(st.nextToken()); // 최소 사탕 개수
			int result = 0; // 답
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				result += Integer.parseInt(st.nextToken()) / K; // 각 종류의 사탕 수 / 최소 사탕 개수
			}
			sb.append(result).append("\n"); 
		}
		System.out.println(sb); // 출력
		br.close();
	}

}
