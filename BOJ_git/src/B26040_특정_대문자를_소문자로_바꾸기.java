import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열의 문자를 확인하여 해당하면 바꾸기
public class B26040_특정_대문자를_소문자로_바꾸기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String S = br.readLine(); // 문자열
		String tmp[] = br.readLine().split(" "); // 바꿀 문자 목록(String)
		int l = tmp.length; // 바꿀 문자 목록 개수
		char alphabet[] = new char[l]; // 바꿀 문자 목록(char)
		for (int i = 0; i < l; i++) { // char to String
			alphabet[i] = tmp[i].charAt(0);
		}
		for (int i = 0; i < S.length(); i++) { // 문자 바꾸기
			char c = S.charAt(i); // 문자열의 문자 
			for (int j = 0; j < l; j++) { // 바꿀 문자 목록에 해당하면 바꾸기
				if (c == alphabet[j]) {
					c = (char) (alphabet[j] + 32);
				}
			}
			sb.append(c);
		}
		System.out.println(sb); // 출력
		br.close();
	}
}