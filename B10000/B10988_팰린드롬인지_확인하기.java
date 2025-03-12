import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 문자열을 앞과 뒤에서 하나씩 비교
public class B10988_팰린드롬인지_확인하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // 문자열
		int start = 0; // 앞 인덱스
		int end = s.length() - 1; // 뒤 인덱스
		boolean palindrome = true; // 팰린드롬 확인(true: 팰린드롬)
		while (start < end) { // 문자열 길이의 반만 확인
			if (s.charAt(start) != s.charAt(end)) { // 앞 뒤가 같지 않으면 
				palindrome = false; // 팰린드롬이 아님
				break; // 반복문 탈출
			}
			start++; // 다음 문자로
			end--; // 다음 문자로
		}
		System.out.println(palindrome ? 1 : 0); // 결과 출력
		br.close();
	}
}