import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열 길이가 2보다 크고(큰따옴표를 제외한 문자가 포함되어 있는 문자열)
// 처음과 끝이 '"'로 되어 있는 문자열이 정확한 문자열
public class B31495_그게_무슨_코드니 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // 입력 문자열
		if (s.length() > 2 && s.charAt(0) == '"' && s.charAt(s.length() - 1) == '"') { // 정확한 문자열
			System.out.println(s.substring(1, s.length() - 1));
		} else { // 그 외
			System.out.println("CE");
		}
		br.close();
	}
}