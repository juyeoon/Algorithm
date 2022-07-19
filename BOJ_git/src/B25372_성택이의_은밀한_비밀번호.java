import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열 길이 체크
public class B25372_성택이의_은밀한_비밀번호 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 비밀번호 개수
		for (int tc = 0; tc < N; tc++) {
			String s = br.readLine(); // 비밀번호 문자열
			if (s.length() >= 6 && s.length() <= 9) { // 6자 이상 9자 이하면
				sb.append("yes\n"); // yes
			} else { // 그 외는
				sb.append("no\n"); // no
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
