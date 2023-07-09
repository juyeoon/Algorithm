import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 단어의 문자를 String.charAt()으로 접근
// char의 아스키코드로 빼기 계산
public class B5218_알파벳_거리 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			String s1 = st.nextToken(); // 첫번째 단어
			String s2 = st.nextToken(); // 두번째 단어
			sb.append("Distances: ");
			int leng = s1.length(); // 단어 길이
			for (int i = 0; i < leng; i++) {
				int tmp = s2.charAt(i) - s1.charAt(i); // 알파벳 거리
				sb.append(tmp < 0 ? tmp + 26 : tmp).append(" "); // 계산한 거리가 음수면 26 더하여 출력
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.readLine();
	}
}