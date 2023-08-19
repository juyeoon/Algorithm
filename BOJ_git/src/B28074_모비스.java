import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 'M','O','B','I','S'의 존재 여부를 저장하는 boolean 배열을 만들어 'M','O','B','I','S'가 등장하면 해당 값을 true로 변환
// 배열을 순회하여 전부 true면 "YES", 그 외에는 "NO" 출력
public class B28074_모비스 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // 입력 문자열
		boolean mobis[] = new boolean[5]; // MOBIS 존재 여부 출력
		for (int i = 0; i < s.length(); i++) { // 문자열 순회
			char c = s.charAt(i); // 문자
			// 'M','O','B','I','S'가 등장하면 해당 값을 true로 변환
			if (c == 'M') {
				mobis[0] = true;
			} else if (c == 'O') {
				mobis[1] = true;
			} else if (c == 'B') {
				mobis[2] = true;
			} else if (c == 'I') {
				mobis[3] = true;
			} else if (c == 'S') {
				mobis[4] = true;
			}
		}
		// 전부 true면 "YES", 그 외에는 "NO" 출력
		System.out.println(mobis[0] && mobis[1] && mobis[2] && mobis[3] && mobis[4] ? "YES" : "NO"); // 출력
		br.close();
	}
}