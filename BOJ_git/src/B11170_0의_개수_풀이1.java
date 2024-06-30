import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 풀이 1: N부터 M까지 각 수를 문자의 배열로 변환 후 각 자리의 수가 0이면 카운트 후 카운트 출력
// (708ms)
public class B11170_0의_개수_풀이1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int cnt = 0; // N부터 M까지 0의 개수
			for (int i = N; i <= M; i++) {
				char[] c = Integer.toString(i).toCharArray(); // 현재 수를 문자의 배열로
				for (int j = 0; j < c.length; j++) { // 현재 수의 각 자리 수 확인
					if (c[j] == '0') { // 0이면
						cnt++; // 카운트
					}
				}
			}
			sb.append(cnt).append("\n"); // 카운트 값 출력
		}
		System.out.println(sb); // 출력
		br.close();
	}
}