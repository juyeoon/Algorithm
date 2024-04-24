import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 문자열의 연속된 중복 문자를 제거하여 출력하는 문제
// 이전 문자를 저장한 후 현재 문자와 비교 후 같지 않으면 출력에 저장한 후 이전 문자 갱신
public class B31656_Sticky_Keys {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine(); // 입력 문자열
		char pre = s.charAt(0); // 이전 문자(현재: 첫번째 문자)
		sb.append(pre); // 첫번째 문자 출력 저장
		for (int i = 1; i < s.length(); i++) {
			char c = s.charAt(i); // 현재 문자
			if (c != pre) { // 현재 문자와 이전 문자가 같지 않으면(중복 아님)
				sb.append(c); // 출력 저장
				pre = c; // 이전 문자 갱신
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}