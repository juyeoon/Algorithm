import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/15322
// 최소 회전을 하기 위해선
// 행 수 > 열 수 일 때, 위아래로 회전 (||||)
// 행 수 < 열 수 일 때, 좌우로 회전 (=)
// 시작과 끝일 때는 회전을 하지 않으므로
// 행과 열 중 (작은 값 - 1) * 2
public class B15322_Košnja {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int K = Integer.parseInt(br.readLine()); // 땅 개수
		for (int i = 0; i < K; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); // 행 수
			int M = Integer.parseInt(st.nextToken()); // 열 수
			int rot = (Math.min(N, M) - 1) * 2; // 최소 회전 수
			sb.append(rot).append("\n"); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
