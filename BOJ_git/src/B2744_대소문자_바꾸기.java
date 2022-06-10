import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 아스키코드 이용
public class B2744_대소문자_바꾸기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine(); // 문자열
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i); // 문자열 중 한 문자
			if (c <= 90) { // 대문자
				sb.append((char) (c + 32)); // 소문자로
			} else { // 소문자
				sb.append((char) (c - 32)); // 대문자로
			}
		}
		System.out.println(sb);
	}
}
