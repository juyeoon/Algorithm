import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 문자열들의 같은 자리 숫자 중 큰 수를 선택 후 문자열 출력
public class B29340_Отряд {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String a = br.readLine(); // 입력 문자열 a
		String b = br.readLine(); // 입력 문자열 b
		for (int i = 0; i < a.length(); i++) { // 입력 문자열들의 같은 자리 숫자 중 큰 수 선택
			if (a.charAt(i) > b.charAt(i)) {
				sb.append(a.charAt(i));
			} else {
				sb.append(b.charAt(i));
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}