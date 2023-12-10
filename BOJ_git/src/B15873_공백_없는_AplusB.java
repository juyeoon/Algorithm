import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 문자열의 두번째 문자가 0이면 A가 10, 0이 아니면 10미만(한자리 수)
public class B15873_공백_없는_AplusB {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // 입력 문자열
		int A = 0;
		int B = 0;
		if (s.charAt(0) == '1' && s.charAt(1) == '0') { // A가 10일 때
			A = 10;
			B = Integer.parseInt(s.substring(2)); // 입력 문자열에서 앞에 두 문자(A)를 제외한 수
		} else { // A가 10 미만일 때
			A = (int) (s.charAt(0) - '0'); // 입력 문자열의 가장 앞 문자
			B = Integer.parseInt(s.substring(1)); // 입력 문자열에서 앞에 한 문자(A)를 제외한 수
		}
		System.out.println(A + B); // A+B 출력
		br.close();
	}
}
