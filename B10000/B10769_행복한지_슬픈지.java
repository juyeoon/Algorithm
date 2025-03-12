import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력받은 문자열의 문자가 ':'면 뒤에 두 문자까지 확인하여 조건에 맞으면 해당하는 카운트
// 카운트에 따라 출력
public class B10769_행복한지_슬픈지 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char S[] = br.readLine().toCharArray(); // 입력받은 문자열
		int end = S.length - 2; // 반복문 종료 조건
		int sCnt = 0; // sad 카운트
		int hCnt = 0; // happy 카운트
		for (int i = 0; i < end; i++) { // 입력 문자열의 문자 확인
			if (S[i] == ':') {
				if (S[i + 1] == '-') {
					if (S[i + 2] == ')') { // happy
						hCnt++;
					} else if (S[i + 2] == '(') { // sad
						sCnt++;
					}
					i++; // 확인한 문자 넘어가기
				}
				i++; // 확인한 문자 넘어가기
			}
		}
		// 카운트를 비교하여 출력
		if (hCnt > sCnt) {
			System.out.println("happy");
		} else if (hCnt < sCnt) {
			System.out.println("sad");
		} else if (hCnt == 0) {
			System.out.println("none");
		} else {
			System.out.println("unsure");
		}
		br.close();
	}
}