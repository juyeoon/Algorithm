import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 아스키코드로 문자를 3만큼 빼서 출력
// ABC를 XYZ로 돌리기 위해서 ABC에 26을 더함(뒤에서 일괄적으로 3을 빼기 위해서 목표 문자보다 3크게 더함)
public class B5598_카이사르_암호 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine(); // 입력 문자열
		for (int i = 0; i < s.length(); i++) { // 문자열 길이만큼 반복
			char c = s.charAt(i); // 문자 하나
			if (c <= 67) { // ABC를 XYZ로 돌리기 위해 사전 작업
				c += 26;
			}
			sb.append((char) (c - 3)); // 원래 문자로 바꾸어 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}