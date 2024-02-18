import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 아스키코드로 문자열의 문자를 수로 변경한 후 합을 구함 => 문자열을 수로 변경한 값들의 합(num)을 구함
// 2부터 num의 제곱근까지 나누어서 나머지가 없으면 소수가 아님
public class B2153_소수_단어 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine(); // 입력 문자열
		int num = 0; // 문자열을 수로 변경한 값(문자들을 수로 변경한 값들의 합)
		for (int i = 0; i < s.length(); i++) { // 문자열을 수로 변경하기
			char c = s.charAt(i); // 문자
			if (c > 96) { // 소문자
				num += c - 96;
			} else { // 대문자
				num += c - 38;
			}
		}
		boolean isPrime = true; // 소수 여부(true: 소수(1포함), false: 합성수)
		int end = (int) Math.sqrt(num); // 소수 구할 때 반복 끝 값
		for (int i = 2; i <= end; i++) { // 소수 판별
			if (num % i == 0) { // 나누어 떨어지면
				isPrime = false; // 소수가 아님
				break;
			}
		}
		bw.write(isPrime ? "It is a prime word." : "It is not a prime word."); // 출력
		bw.flush();
		bw.close();
		br.close();
	}
}