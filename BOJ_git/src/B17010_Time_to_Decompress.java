import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 입력 수만큼 입력 문자 반복하여 출력
public class B17010_Time_to_Decompress {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 입력 라인 개수
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()); // 반복 횟수
			char c = st.nextToken().charAt(0); // 반복 문자
			for (int i = 0; i < n; i++) { // 반복 문자열 만들기
				sb.append(c);
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}