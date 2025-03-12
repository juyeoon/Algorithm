import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열의 문자를 하나씩 보면서 2의 개수와 e의 개수를 센 후 개수 비교
public class B17094_Serious_Problem {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 입력 문자열 길이
		String s = br.readLine(); // 입력 문자열 
		int cnt2 = 0; // 2의 개수
		int cnte = 0; // e의 개수
		for (int i = 0; i < N; i++) { // 개수 세기
			if (s.charAt(i) == '2') {
				cnt2++;
			} else {
				cnte++;
			}
		}
		if (cnt2 > cnte) { // 2가 더 많음
			System.out.println(2);
		} else if (cnt2 < cnte) { // e가 더 많음
			System.out.println('e');
		} else { // 개수가 같음
			System.out.println("yee");
		}
		br.close();
	}
}