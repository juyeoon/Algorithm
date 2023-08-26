import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열의 문자를 하나씩 확인하여 'e', 'i', 'E', 'I'이면 변경하여 출력
public class B5358_Football_Team {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while ((s = br.readLine()) != null) { // EOF
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (c == 'e') {
					c = 'i';
				} else if (c == 'i') {
					c = 'e';
				} else if (c == 'E') {
					c = 'I';
				} else if (c == 'I') {
					c = 'E';
				}
				sb.append(c);
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}