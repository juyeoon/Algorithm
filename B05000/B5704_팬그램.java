import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 문자열마다 알파벳 등장 여부를 저장하는 배열에 알파벳 등장 여부를 저장하고 배열에 false가 있으면 'N', 다 true면 'Y'
public class B5704_팬그램 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = ""; // 입력 문자열
		while (!(s = br.readLine()).equals("*")) { // EOI
			boolean alphabet[] = new boolean[26]; // 알파벳 등장 여부 저장 배열
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == ' ') { // 공백 스킵
					continue;
				}
				alphabet[s.charAt(i) - 97] = true; // 알파벳 등장 여부 저장
			}
			boolean pangram = true; // 팬그램 여부 저장
			for (boolean b : alphabet) {
				if (!b) {
					pangram = false;
				}
			}
			sb.append(pangram ? "Y\n" : "N\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}