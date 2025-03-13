import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/26594
// 연속으로 같은 문자가 나오지 않기 때문에 첫번째 문자와 다른 문자가 나올 때까지 카운트
public class B26594_ZOAC_5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		char first = s.charAt(0); // 첫번째 문자
		int N = 0; // 반복 횟수
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == first) { // 같은 문자가 나오면 카운트
				N++;
			} else { // 다른 문자가 나오면 그만 카운트
				break;
			}
		}
		System.out.println(N); // 출력
		br.close();
	}
}
