import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 8진수의 숫자 하나를 세 자리의 2진수로 바꾸는 것을 반복
// 앞의 0은 정규식으로 변경
public class B1212_8진수_2진수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine(); // 8진수
		for (int i = 0; i < s.length(); i++) { // 앞에서부터 8진수의 숫자를 확인
			int num = s.charAt(i) - 48; // 숫자형으로 변경
			int two = 4; // num을 나눌 수. 4, 2, 1 순으로 변경됨(2진수 자리 수)
			while (two > 0) { // 세 자리의 2진수로 변경
				sb.append(num / two); // 2진수 값 추가
				if (num / two == 1) {
					num -= two; // num 갱신
				}
				two /= 2; // 다음 자리 수를 구하기 위한 갱신
			}
		}
		System.out.println(sb.toString().replaceFirst("^0+(?!$)", "")); // 앞의 불필요한 0 제거(정규식)
		br.close();
	}
}