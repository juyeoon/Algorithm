import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 문자열의 0번째 문자와 1번째 문자가 같으면 1 아니면 0
public class B27324_ゾロ目_Same_Numbers {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // 입력 값
		System.out.println(s.charAt(0) == s.charAt(1) ? 1 : 0); // 출력
		br.close();
	}
}