import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 한자리씩 10진수로 변환
public class B1550_16진수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // 16진수
		long cnt = 0; // 10진수 값
		long mul = 1; // 자리 수에 따른 16 제곱
		// 한자리씩 10진수로 변환
		for (int i = s.length() - 1; i >= 0; i--) { // s의 index 0부터 시작
			if (s.charAt(i) < 58) { // 0~9
				cnt += (s.charAt(i) - 48) * mul;
			} else { // A~F
				cnt += (s.charAt(i) - 55) * mul;
			}
			mul *= 16; // 자리 수에 따른 16 제곱
		}
		System.out.println(cnt);
		br.close();
	}
}
