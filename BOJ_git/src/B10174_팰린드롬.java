import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력받은 문자열을 모두 소문자로 변경한 후 인덱스 처음과 끝 각각을 하나씩 줄이고 늘리면서 같은 문자인지 확인
public class B10174_팰린드롬 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < n; tc++) {
			char[] c = br.readLine().toLowerCase().toCharArray(); // 모두 소문자로 변경한 문자열
			int end = c.length / 2; // 반복문 끝
			boolean palindrome = true; // 팰린드롬 여부(true: 팰린드롬)
			for (int i = 0, j = c.length - 1; i < end; i++, j--) { // 처음과 끝에서부터 하나씩 확인
				if (c[i] != c[j]) { // 문자가 다르면 팰린드롬이 아님
					palindrome = false;
					break;
				}
			}
			sb.append(palindrome ? "Yes\n" : "No\n"); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
