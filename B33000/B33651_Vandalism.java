import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/33651
// UAPC 중에 어떤 알파벳이 빠졌는지 출력하는 문제
// 순서가 유지되므로 UAPC의 한 문자씩 확인하면서 없는 알파벳에 대해서 출력을 저장하고 확인 끝난 후 전체 출력
public class B33651_Vandalism {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine(); // 입력 문자열
		String uapc = "UAPC"; // UAPC
		int idx = 0; // 확인할 위치
		for (char c : uapc.toCharArray()) {
			if (idx < s.length() && s.charAt(idx) == c) { // 존재
				idx++;
			} else { // 없음
				sb.append(c);
			}
		}
		System.out.println(sb); // 출력
	}
}
