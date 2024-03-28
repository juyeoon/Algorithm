import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 문자열을 char 배열로 입력 받은 후 y의 개수와 모음의 개수를 각각 세고
// 모음의 개수 + " " + (모음 개수 + y 개수) 출력
public class B31306_Is_Y_a_Vowel {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] c = br.readLine().toCharArray(); // 입력 문자열 문자 배열
		int leng = c.length; // 입력 문자열 길이
		int vowelCnt = 0; // 모음 개수
		int yCnt = 0; // 'y' 개수
		for (int i = 0; i < leng; i++) { // 개수 세기
			if (c[i] == 'y') { // 'y' 개수 세기
				yCnt++;
			} else if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') { // 모음 개수 세기
				vowelCnt++;
			}
		}
		System.out.println(vowelCnt + " " + (vowelCnt + yCnt)); // 출력
		br.close();
	}
}