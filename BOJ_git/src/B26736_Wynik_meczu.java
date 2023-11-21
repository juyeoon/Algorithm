import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 문자열의 문자의 등장 횟수 출력
public class B26736_Wynik_meczu {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // 입력 문자열
		int A = 0; // A개수
		int B = 0; // B개수
		for (int i = 0; i < s.length(); i++) { // 문자열 순회
			if (s.charAt(i) == 'A') { // 문자가 A이면
				A++;
			} else { // 문자가 B이면
				B++;
			}
		}
		System.out.println(A + " : " + B); // 출력
		br.close();
	}
}