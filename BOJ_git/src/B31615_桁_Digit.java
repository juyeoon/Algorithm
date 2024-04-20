import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 두 수의 합이 십진수로 몇자리 수인지 확인하는 문제
// 두 수의 합(int)을 String으로 변환 후 length() 출력
public class B31615_桁_Digit {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = Integer.parseInt(br.readLine()) + Integer.parseInt(br.readLine()); // 두 수의 합
		System.out.println(String.valueOf(sum).length()); // 문자열로 변환 후 길이 출력
		br.close();
	}
}