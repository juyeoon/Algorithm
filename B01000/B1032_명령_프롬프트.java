import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// StringBuilder.setCharAt()을 이용하여 특정 위치의 문자 변경
// 첫 문장을 StringBuilder에 넣고 다음 문자열과 비교하여 같은 위치의 문자가 다르면 StringBuilder의 문자를 ?로 변경
public class B1032_명령_프롬프트 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 파일 개수
		StringBuilder ans = new StringBuilder(br.readLine()); // 첫 문자열(출력 문자열)
		for (int i = 1; i < N; i++) { // 두 번째 파일 이름부터 마지막 파일 이름까지 확인
			String s = br.readLine(); // 비교할 파일 이름
			for (int j = 0; j < s.length(); j++) { // 문자 비교
				if (ans.charAt(j) == '?') { // ans의 문자가 ?면 다음 문자로(비교 필요 X)
					continue;
				}
				if (ans.charAt(j) != s.charAt(j)) { // 문자가 다르면 ? 로 문자 변경
					ans.setCharAt(j, '?');
				}
			}
		}
		System.out.println(ans); // 출력
		br.close();
	}
}