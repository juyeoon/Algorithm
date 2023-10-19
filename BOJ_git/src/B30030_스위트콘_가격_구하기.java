import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 부가세 제외 가격 A = 부가세 포함 가격 B / 11 * 10
public class B30030_스위트콘_가격_구하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(Integer.parseInt(br.readLine()) / 11 * 10); // 출력
		br.close();
	}
}