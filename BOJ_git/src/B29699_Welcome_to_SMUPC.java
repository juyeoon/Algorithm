import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// N번째 문자는 (문자열의 길이인 14로 N을 나눈 나머지)번째의 문자와 같음
public class B29699_Welcome_to_SMUPC {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // N번째
		String s = "WelcomeToSMUPC"; // 확인할 문자열
		System.out.println(s.charAt((N - 1) % 14)); // N번째 문자 출력
		br.close();
	}
}