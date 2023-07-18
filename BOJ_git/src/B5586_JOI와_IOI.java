import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// J가 등장하면 뒤에 두 문자도 확인 후 JOI면 카운트 + O 뛰어넘기
// I가 등장하면 뒤에 두 문자도 확인 후 IOI면 카운트 + O 뛰어넘기
public class B5586_JOI와_IOI {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // 입력 문자열
		int end = s.length() - 2; // 확인할 길이(범위 때문)
		int Jcnt = 0; // "JOI" 개수
		int Icnt = 0; // "IOI" 개수
		for (int i = 0; i < end; i++) {
			if (s.charAt(i) == 'J' && s.charAt(i + 1) == 'O' && s.charAt(i + 2) == 'I') { // "JOI" 확인
				Jcnt++; // 개수 추가
				i++; // 'O' 건너뛰기
			} else if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'O' && s.charAt(i + 2) == 'I') { // "IOI" 확인
				Icnt++; // 개수 추가
				i++; // 'O' 건너뛰기
			}
		}
		System.out.println(Jcnt); // 출력
		System.out.println(Icnt); // 출력
		br.close();
	}
}