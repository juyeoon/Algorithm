import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 한 테스트케이스에 9번을 반복하여 각각 숫자를 더한 뒤 비교
public class B10214_Baseball {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			int y = 0; // 연세
			int k = 0; // 고려
			for (int i = 0; i < 9; i++) {
				st = new StringTokenizer(br.readLine());
				y += Integer.parseInt(st.nextToken()); // 연세 점수 추가
				k += Integer.parseInt(st.nextToken()); // 고려 점수 추가
			}
			// 연세가 더 높음, 고려가 더 높음, 비김으로 경우를 나눔
			sb.append((y > k) ? "Yonsei" : ((y < k) ? "Korea" : "Draw")).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}