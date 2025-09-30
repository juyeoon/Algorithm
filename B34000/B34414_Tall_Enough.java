import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/34414
// boolean 변수를 두고 하나라도 48 미만인 값이 있으면 "False" 출력
public class B34414_Tall_Enough {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 입력받을 키의 개수
		boolean isTrue = true; // 모든 값이 48인치 이상인지
		for (int i = 0; i < n; i++) {
			if (Integer.parseInt(br.readLine()) < 48) { // 48 미만이면
				isTrue = false;
				break; // 반복문 종료
			}
		}
		System.out.println(isTrue ? "True" : "False"); // 출력
		br.close();
	}
}
