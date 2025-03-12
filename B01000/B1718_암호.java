import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 암호화 키에 해당하는 수를 배열에 저장 후
// 평문의 문자를 하나씩 확인하면서 공백이 아닌 문자면 위치에 맞는 암호키의 수만큼 char 변수에서 빼기
// char 값이 'a'보다 작으면 알파벳 개수인 26만큼 더하여 소문자 문자로 변경
public class B1718_암호 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String plain = br.readLine(); // 평문
		String key = br.readLine(); // 암호키
		int keyleng = key.length(); // 암호키 길이
		int keyNum[] = new int[keyleng]; // 암호키에 해당하는 수
		for (int i = 0; i < keyleng; i++) { // input keyNum[]
			keyNum[i] = key.charAt(i) - 'a' + 1;
		}
		for (int i = 0; i < plain.length(); i++) { // 평문 길이만큼 반복
			char c = plain.charAt(i); // 바꿀 문자
			if (c == ' ') { // 공백이면
				sb.append(" "); // 출력에 공백 추가
			} else { // 문자면
				c -= keyNum[i % keyleng]; // 암호키에 해당하는 수만큼 앞의 알파벳으로 변경
				if (c < 'a') { // 'a' 보다 앞이면 알파벳 개수인 26 더하기
					c += 26;
				}
				sb.append(c); // 출력에 암호 문자 추가
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}