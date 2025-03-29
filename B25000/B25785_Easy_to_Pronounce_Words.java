import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/25785
// 입력 단어의 문자를 확인하면서 이전 단어가 자음인지 모음인지 저장하면서 연속된 문자를 확인
public class B25785_Easy_to_Pronounce_Words {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // 입력 단어
		int vowel = 0; // 이전 단어의 모음 여부 (1: 모음)
		int leng = s.length(); // 반복문 종료 조건
		char firstC = s.charAt(0); // 단어의 첫번째 문자 (vowel 변수 초기화용)
		if (firstC == 'a' || firstC == 'e' || firstC == 'i' || firstC == 'o' || firstC == 'u') {
			vowel = 1;
		}
		boolean easy = true; // 발음 쉬운 단어인지 (true: 쉬운 단어)
		for (int i = 1; i < leng; i++) {
			char c = s.charAt(i); // 현재 문자
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') { // 모음
				if (vowel == 0) { // 자음 - 모음
					vowel = 1;
				} else { // 모음 - 모음
					easy = false;
					break;
				}
			} else { // 자음
				if (vowel == 1) { // 모음 - 자음
					vowel = 0;
				} else { // 자음 - 자음
					easy = false;
					break;
				}
			}
		}
		System.out.println(easy ? 1 : 0); // 출력
		br.close();
	}
}
