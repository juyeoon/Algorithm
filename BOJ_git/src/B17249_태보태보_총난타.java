import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// "("로 문자열을 2개로 나눈 후 "="를 없앤 길이(앞 문자열)와 "="를 없애고 "^0^)"를 제외한 길이(뒤 문자열)을 출력
public class B17249_태보태보_총난타 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split("\\("); // "("로 문자열을 2개로 나눔
		// "="를 없앤 길이(앞 문자열)와 "="를 없애고 "^0^)"를 제외한 길이(뒤 문자열)을 출력
		System.out.println(s[0].replaceAll("=", "").length() + " " + (s[1].replaceAll("=", "").length() - 4));
		br.close();
	}
}