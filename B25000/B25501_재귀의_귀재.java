import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열의 앞과 뒤의 문자를 문자열 길이 절만만큼 반복문을 사용하여 확인
public class B25501_재귀의_귀재 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			char s[] = br.readLine().toCharArray(); // 입력 문자열 배열
			int sl = s.length / 2 + 1; // 문자열 길이의 절반 + 1(까지 반복하여 확인)
			int cnt = 0; // 반복(재귀) 횟수
			boolean isPalindrome = true; // 팰린드롬 여부
			for (int i = 0; i < sl; i++) { // 팰린드롬 확인
				cnt++; // 횟수 갱신
				if (s[i] != s[s.length - 1 - i]) { // 문자가 다르면
					isPalindrome = false; // 팰린드롬 아님
					break; // 반복문 탈출
				}
			}
			sb.append(isPalindrome?"1 ":"0 ").append(cnt).append("\n");
		}
		System.out.println(sb); // 출력
		br.readLine();
	}
}