import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// A와 B의 총점을 계산 후 이긴 사람 출력
public class B18198_Basketball_One_on_One {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int A = 0; // A의 점수
		int B = 0; // B의 점수
		for (int i = 0; i < s.length(); i += 2) {
			if (s.charAt(i) == 'A') { // A
				A += s.charAt(i + 1) - '0'; // 점수 추가
			} else { // B
				B += s.charAt(i + 1) - '0'; // 점수 추가
			}
		}
		if (A > B) { // A가 이겼으면
			System.out.println('A');
		} else { // B가 이겼으면
			System.out.println('B');
		}
		br.close();
	}
}