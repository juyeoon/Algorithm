import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열의 문자가 'a','e','i','o','s'면 대체 문자를 출력에 저장, 그 외에는 현재 문자를 출력에 저장한 후 출력
public class B26768_H4x0r {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine(); // 입력 문자열
		int leng = s.length(); // 문자열 길이
		for (int i = 0; i < leng; i++) {
			char c = s.charAt(i); // 현재 문자
			if (c == 'a') { // a
				sb.append(4);
			} else if (c == 'e') { // e
				sb.append(3);
			} else if (c == 'i') { // i
				sb.append(1);
			} else if (c == 'o') { // o
				sb.append(0);
			} else if (c == 's') { // s
				sb.append(5);
			} else { // 그 외
				sb.append(c);
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}