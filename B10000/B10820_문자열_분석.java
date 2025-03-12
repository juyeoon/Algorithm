import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// EOF 사용
// 문자열의 문자를 아스키코드로 소문자, 대문자, 숫자, 공백으로 구분한 후 각각에 맞게 개수 추가
public class B10820_문자열_분석 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = ""; // 문자열
		while ((s = br.readLine()) != null) { // EOF
			int small = 0; // 소문자 개수
			int big = 0; // 대문자 개수
			int num = 0; // 숫자 개수
			int space = 0; // 공백 개수
			for (int i = 0; i < s.length(); i++) { // 문자 하나 확인. 문자열 길이만큼 확인
				char c = s.charAt(i); // 문자
				if (c == ' ') { // 공백
					space++;
				} else if (48 <= c && c <= 57) { // 숫자
					num++;
				} else if (65 <= c && c <= 90) { // 대문자
					big++;
				} else { // 소문자
					small++;
				}
			}
			// 개수 출력
			sb.append(small).append(" ").append(big).append(" ");
			sb.append(num).append(" ").append(space).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}