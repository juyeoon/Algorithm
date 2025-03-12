import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 풀고 있는 문제 수를 저장하는 변수를 두고
// 입력받은 문자열에 따라 문제 수를 변화ㅏ시키는 if-else문 작성
// 풀고 있는 문제 수가 0이면 "고무오리야 사랑해" 아니면 "힝구" 출력
public class B20001_고무오리_디버깅 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // 입력 문자열
		int problemCnt = 0; // 풀고 있는 문제
		while (!(s = br.readLine()).equals("고무오리 디버깅 끝")) { // EOI
			if (s.equals("문제")) { // 문제를 받으면
				problemCnt++; // 풀고 있는 문제 수 추가
			} else if (problemCnt == 0) { // 고무오리를 받았는데 풀고 있는 문제가 없을 때
				problemCnt += 2; // 벌칙으로 두 문제 추가
			} else { // 고무오리를 받았는데 풀고 있는 문제가 있을 때
				problemCnt--; // 한 문제 해결
			}
		}
		System.out.println(problemCnt == 0 ? "고무오리야 사랑해" : "힝구"); // 출력
		br.close();
	}
}