import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 각 입력 라인의 값 중 최댓값을 찾는 문제
public class B9699_RICE_SACK {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수
		for (int tc = 1; tc <= T; tc++) {
			sb.append("Case #").append(tc).append(": ");
			st = new StringTokenizer(br.readLine());
			int max = Integer.MIN_VALUE; // 최댓값
			for (int i = 0; i < 5; i++) { // 최댓값 찾기
				max = Math.max(max, Integer.parseInt(st.nextToken()));
			}
			sb.append(max).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}