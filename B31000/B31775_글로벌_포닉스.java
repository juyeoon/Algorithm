import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// boolean 배열로 문자열 처음 문자가 l, k, p 문자로 시작하는지 저장
// 세 값이 모두 true면 "GLOBAL" 출력 그 외는  "PONIX" 출력
public class B31775_글로벌_포닉스 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean lkp[] = new boolean[3]; // l, k, p 문자로 시작하는지 저장
		for (int i = 0; i < 3; i++) { // 세 문자열 확인
			String s = br.readLine(); // 입력 문자열
			char c = s.charAt(0); // 문자열의 첫 문자
			if (c == 'l') { // 'l'로 시작하는 경우
				lkp[0] = true;
			} else if (c == 'k') { // 'k'로 시작하는 경우
				lkp[1] = true;
			} else if (c == 'p') { // 'p'로 시작하는 경우
				lkp[2] = true;
			}
		}
		System.out.println(lkp[0] & lkp[1] & lkp[2] ? "GLOBAL" : "PONIX"); // 출력
		br.close();
	}
}