import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/6750
// 주어진 문자열의 문자를 switch-case로 사용가능한 문자가 맞는지 확인 후 사용 불가능한 문자면 "NO"출력
// 전부 사용 가능한 문자면 "YES" 출력
public class B6750_Rotating_letters {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // 주어진 문자열
		boolean usable = true; // 간판에 사용 가능 여부
		Loop: for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i); // 확인할 문자
			switch (c) {
			case 'I':
			case 'O':
			case 'S':
			case 'H':
			case 'Z':
			case 'X':
			case 'N':
				break;
			default: // 사용 가능한 문자가 아니면
				usable = false;
				break Loop; // 반복문 탈출
			}
		}
		System.out.println(usable ? "YES" : "NO"); // 출력
		br.close();
	}
}
