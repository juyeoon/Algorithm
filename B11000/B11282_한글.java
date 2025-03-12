import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 주어진 초성, 중성, 종성의 조합 순서는 아스키코드 순서와 같음
// '가' = 44032 = 1 + 44031
public class B11282_한글 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // N번째 문자
		System.out.println((char) (N + 44031)); // 문자 출력
		br.close();
	}
}
