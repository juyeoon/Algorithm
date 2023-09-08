import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 대문자 = 소문자 - 32
// 소문자와 대문자를 변수에 저장해 놓고 문자열의 문자를 하나씩 비교해서 세기
public class B2386_도비의_영어_공부 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("#")) { // EOF
			char c = s.charAt(0); // 확인할 소문자
			char C = (char) (c - 32); // 확인할 소문자의 대문자
			int cnt = 0; // 개수
			for (int i = 2; i < s.length(); i++) { // 문자열에서 확인
				if (s.charAt(i) == c || s.charAt(i) == C) { // 해당하면
					cnt++; // 카운트
				}
			}
			sb.append(c).append(" ").append(cnt).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}