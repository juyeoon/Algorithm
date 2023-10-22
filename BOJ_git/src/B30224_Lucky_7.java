import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 7이 포함되어 있는지 확인 => String.charAt(i)이 '7'인지 확인
// 7로 나누어 떨어지는지 확인 => %7이 0인지 확인
public class B30224_Lucky_7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // 입력 수 (문자열)
		int n = Integer.parseInt(s); // 입력 수 (수)
		boolean contain7 = false; // 7 포함 여부(true: 포함)
		for (int i = 0; i < s.length(); i++) { // 7 포함 여부 확인
			if (s.charAt(i) == '7') { // 7이 포함되어 있으면
				contain7 = true;
				break;
			}
		}
		if (contain7) { 
			if (n % 7 == 0) { // 7 포함 & 7로 나누어 떨어짐
				System.out.println(3);
			} else { // 7 포함 & 7로 나누어 떨어지지 않음
				System.out.println(2);
			}
		} else {
			if (n % 7 == 0) { // 7 포함 X & 7로 나누어 떨어짐
				System.out.println(1);
			} else { // 7 포함 X & 7로 나누어 떨어지지 않음
				System.out.println(0);
			}
		}
		br.close();
	}
}