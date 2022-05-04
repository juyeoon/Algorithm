import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//11655 - ROT13
public class B11655_ROT13 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s[] = br.readLine().split(" "); // 문자열을 공백 기준으로 나눔(단어 단위)
		for (int i = 0; i < s.length; i++) { // 단어 수 만큼 반복
			String s1 = s[i]; // 단어
			for (int j = 0; j < s1.length(); j++) { // 단어의 문자 수 만큼 반복(문자 단위)
				char c = s1.charAt(j); // 문자
				if (c >= 65 && c <= 90) { // 대문자
					c += 13; // ROT13
					if (c > 90) { // 대문자 범위 넘어가면
						c -= 26; // 'A'로 돌아가게 설정
					}
				} else if (c >= 97 && c <= 122) { // 소문자
					c += 13; // ROT13
					if (c > 122) { // 소문자 범위 넘어가면
						c -= 26; // 'a'로 돌아가게 설정
					}
				}
				sb.append(c); // ROT13한 문자 추가
			}
			sb.append(" "); // 공백 삽입(한 단어 끝남)
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
