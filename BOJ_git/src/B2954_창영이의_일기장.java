import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열의 문자를 하나씩 확인 후 모음이면 2개 뛰어넘어 다음 문자 확인
public class B2954_창영이의_일기장 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine(); // 입력 문자열
		for (int i = 0; i < s.length(); i++) { // 문자열의 문자 확인
			char c = s.charAt(i); // 문자
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') { // 모음이면
				i += 2; // 'p', '같은 문자' 뛰어 넘고 다음 문자로
			}
			sb.append(c); // 출력문에 문자 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}