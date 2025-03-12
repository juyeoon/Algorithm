import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B20053_최소_최대_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			int N = Integer.parseInt(br.readLine()); // 수 개수
			int max = Integer.MIN_VALUE; // 최댓값
			int min = Integer.MAX_VALUE; // 최솟값
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				int tmp = Integer.parseInt(st.nextToken()); // 입력 값
				if (tmp > max) { // 최댓값 갱신
					max = tmp;
				}
				if (tmp < min) { // 최솟값 갱신
					min = tmp;
				}
			}
			sb.append(min).append(" ").append(max).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}