import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력받은 문자열의 3번째 문자까지 확인 후 전부 '5'일때 YES 아니면 NO 출력
public class B17863_FYI {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // 전화번호(입력 문자열)
		boolean yes = true; // 앞 세 문자가 전부 5이면 true
		for (int i = 0; i < 3; i++) { // 앞 세 문자 확인
			if (s.charAt(i) != '5') { // 5가 아닐 때
				yes = false; // yes를 false로
				break; // 반복문 탈출
			}
		}
		System.out.println(yes ? "YES" : "NO"); // yes 값에 따라 출력
		br.close();
	}
}