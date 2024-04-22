import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 문자열이 모두 같은 문자로 이루어져 있는지 확인하는 문제
// 문자열의 첫번째 문자를 저장한 후 이후 문자와 비교한 후 한 번이라도 같지 않으면 "No" 출력
public class B31616_揃った文字_Matched_Letters {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 입력 문자열의 길이
		String s = br.readLine(); // 입력 문자열
		char c = s.charAt(0); // 문자열의 첫번째 문자
		boolean no = false; // 모두 같은 문자로 이루어져 있는지 여부 (true: 같은 문자로 이루어져 있지 않음)
		for (int i = 1; i < N; i++) { // 문자열 순회
			if (c != s.charAt(i)) { // 현재 문자가 첫번째 문자와 같지 않으면
				no = true; // 같은 문자로 이루어져 있지 않음
				break;
			}
		}
		System.out.println(no ? "No" : "Yes"); // 출력
		br.close();
	}
}