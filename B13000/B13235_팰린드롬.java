import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 바깥에서부터 안쪽까지 대응하는 위치의 문자가 같은지 확인
public class B13235_팰린드롬 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // 입력 문자열
		boolean palindromes = true; // 팰린드롬 여부
		int center = s.length() / 2; // 가운데 idx
		int endIdx = s.length() - 1; // 문자열 마지막 idx
		for (int i = 0; i < center; i++) { // 바깥에서부터 안쪽으로 확인
			if (s.charAt(i) != s.charAt(endIdx - i)) { // 대응하는 위치의 문자가 같지 않으면
				palindromes = false; // 팰린드롬이 아님
				break;
			}
		}
		System.out.println(palindromes ? "true" : "false"); // 출력
		br.close();
	}
}