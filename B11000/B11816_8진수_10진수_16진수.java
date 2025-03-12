import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 앞이 '0x'면 16진수, 자릿수 * 16의n제곱
// 앞이 '0'이면 8진수, 자릿수 * 8의n제곱
// 그 외의 경우 10진수, 그대로 출력
public class B11816_8진수_10진수_16진수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // 입력 수
		if (s.charAt(0) == '0' && s.charAt(1) == 'x') { // 16진수
			int ans = 0; // 변환한 10진수
			int place = 1; // 자릿값
			for (int i = s.length() - 1; i > 1; i--) { // 끝에서 3번째까지
				if (s.charAt(i) >= 97) { // a~f
					ans += place * (s.charAt(i) - 87);
				} else { // 0~9
					ans += place * (s.charAt(i) - 48);
				}
				place *= 16; // 자릿값 갱신
			}
			System.out.println(ans); // 출력
		} else if (s.charAt(0) == '0') { // 8진수
			int ans = 0; // 변환한 10진수
			int place = 1; // 자릿값
			for (int i = s.length() - 1; i > 0; i--) { // 끝에서 2번째까지
				ans += place * (int) (s.charAt(i) - '0'); // 0~7
				place *= 8; // 자릿값 갱신
			}
			System.out.println(ans); // 출력
		} else { // 10진수
			System.out.println(s); // 출력
		}
		br.close();
	}
}