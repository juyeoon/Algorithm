import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 박스 크기(N)에 따른 규칙 찾기
// N이 1이면 "#"
// N이 2 이상이면
// 첫 번째 줄, 마지막 줄에 N만큼 "#" 반복
// 가운데에는 맨 앞, 맨 뒤에만 "#", N-2만큼 "J" 반봅ㄱ
public class B5354_J박스 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine()); // 박스 크기
			if (N == 1) { // N이 1일 때 예외 처리
				sb.append("#\n\n"); // "#"과 테스트케이스 사이 빈 행 출력 후
				continue; // 다음 테스트케이스로
			}
			// 첫 번째 줄 => N만큼의 #
			for (int i = 0; i < N; i++) {
				sb.append("#");
			}
			sb.append("\n"); // 다음 줄
			// 가운데
			for (int i = 0; i < N - 2; i++) { // 한 행
				sb.append("#"); // 맨 앞
				for (int j = 0; j < N - 2; j++) { // 가운데 J => N-2만큼 반복
					sb.append("J");
				}
				sb.append("#\n"); // 맨 뒤 + 다음 줄
			}
			// 마지막 줄 => N만큼의 #
			for (int i = 0; i < N; i++) {
				sb.append("#");
			}
			sb.append("\n"); // 다음 줄
			sb.append("\n"); // 테스트 케이스 사이 빈 행
		}
		System.out.println(sb); // 출력
		br.close();
	}
}