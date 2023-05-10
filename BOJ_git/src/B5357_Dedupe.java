import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// 입력 문자열의 이전 문자를 저장한 후 다음 문자가 이전 문자와 같으면 그 다음 문자로, 다르면 그 문자를 저장한 후 문자 출력
public class B5357_Dedupe {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 문자열 개수
		for (int tc = 0; tc < T; tc++) {
			String s = br.readLine(); // 입력 문자열
			char pre = s.charAt(0); // 이전 문자(첫번째 문자)
			sb.append(pre); // 출력 저장
			for (int i = 1; i < s.length(); i++) {
				if (s.charAt(i) == pre) { // 이전 문자와 현재 문자가 같으면
					continue; // 다음 문자로
				}
				// 다르면
				pre = s.charAt(i); // 현재 문자를 이전 문자로 저장
				sb.append(pre); // 출력 저장
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}