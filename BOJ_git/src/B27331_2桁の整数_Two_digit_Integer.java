import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 십의 자리와 일의 자리 숫자를 입력받아 두 자리 수 출력
public class B27331_2桁の整数_Two_digit_Integer {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		sb.append(br.readLine()).append(br.readLine()); // 두 자리 수로 만들기
		System.out.println(sb); // 출력
		br.close();
	}
}