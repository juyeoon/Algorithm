import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/5246
// 행에 있는 체스말 개수를 저장하는 배열을 두고 개수를 센 후 배열을 순회하며 최대 개수를 찾아 출력
public class B5246_Checkerboard_Rows {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 체스판 개수
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken()); // 체스말 개수
			int[] cnt = new int[9]; // 행에 있는 체스말 개수
			for (int j = 0; j < M; j++) {
				st.nextToken(); // 열은 스킵
				cnt[Integer.parseInt(st.nextToken())]++; // 개수 추가
			}
			int max = 0; // 행에 있는 체스말 최대 개수
			for (int j : cnt) { // 최대 개수 찾기
				max = Math.max(max, j);
			}
			sb.append(max).append("\n"); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
