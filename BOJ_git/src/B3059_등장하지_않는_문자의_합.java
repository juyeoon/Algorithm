import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3059_등장하지_않는_문자의_합 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 1; tc <= T; tc++) {
			String s = br.readLine(); // 문자열
			boolean abc[] = new boolean[26]; // 알파벳 등장 여부 확인 배열 (true: 등장, [0]: 'A')
			for (int i = 0; i < s.length(); i++) {
				abc[s.charAt(i) - 65] = true; // 문자 하나 확인
			}
			int sum = 0; // 등장 안 한 문자의 아스키 코드 합
			for (int i = 0; i < 26; i++) { // 배열 순회
				if (!abc[i]) {
					sum += i + 65; // 등장 안 하면 sum에 추가
				}
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}