import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// K에서 S로 되돌아 갔다가 N까지 가는 경우와 K까지 갔다가 처음으로 가서 N까지 가는 경우 중 적은 값을 가지는 걸 선택하는 문제
// K까지 가는 레벨 + S까지 가는 레벨 + S에서 K까지 가는 레벨 + K에서 N까지 가는 레벨
// K에서 S로 되돌아 갔다가 N까지 가는 경우 = K + (K-S) + (K-S) + (N-K)
// K까지 갔다가 처음으로 가서 N까지 가는 경우 = K + S + (K-S) + (N-K)
public class B23925_Retype {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); // 보스가 있는 레벨
			int K = Integer.parseInt(st.nextToken()); // 현재 있는 레벨
			int S = Integer.parseInt(st.nextToken()); // 돌아가야 하는 레벨
			sb.append("Case #").append(tc).append(": "); // 출력 형식
			sb.append(Math.min(K - S, S) + K - S + N).append("\n"); // 되돌아가는 것과 처음부터 하는 것 중에 적은 값을 가지는 값 선택
		}
		System.out.println(sb); // 출력
		br.close();
	}
}