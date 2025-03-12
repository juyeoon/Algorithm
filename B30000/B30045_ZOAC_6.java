import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 문자열의 "01"이나 "OI"가 있으면 카운트 후 카운트 출력
public class B30045_ZOAC_6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 입력 문자열의 수
		int cnt = 0; // 이모티콘 넣을 문자열의 수
		for (int i = 0; i < N; i++) { // 입력 문자열의 수만큼 반복
			char[] c = br.readLine().toCharArray(); // 문자열의 문자 배열
			int leng = c.length - 1; // 문자열 길이 - 1 (for 반복문의 횟수)
			boolean yes = false; // "01"이나 "OI"가 있는지 없는지 (true : 있음)
			for (int j = 0; j < leng; j++) {
				// "01"이나 "OI"가 있으면
				if ((c[j] == '0' && c[j + 1] == '1') || (c[j] == 'O' && c[j + 1] == 'I')) {
					yes = true; // 있음
					break; // 더 이상 확인 X
				}
			}
			if (yes) { // 있으면
				cnt++; // 카운트
			}
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}