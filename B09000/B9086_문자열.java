import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열.charAt() 사용
public class B9086_문자열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int i = 0; i < T; i++) {
			String s = br.readLine();
			sb.append(s.charAt(0)).append(s.charAt(s.length() - 1)).append("\n"); // 첫 글자와 마지막 글자
		}
		System.out.println(sb);
		br.close();
	}
}
