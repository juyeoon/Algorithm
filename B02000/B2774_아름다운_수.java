import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10크기(0~9)의 boolean 배열을 사용하여 숫자의 등장여부를 저장한 후 등장 숫자의 개수를 확인
public class B2774_아름다운_수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			boolean num[] = new boolean[10]; // 0~9까지 등장 여부를 저장하는 배열
			String s = br.readLine(); // 입력 수
			for (int i = 0; i < s.length(); i++) {
				num[s.charAt(i) - 48] = true; // 숫자 등장 여부 갱신
			}
			int cnt = 0; // 등장 숫자 개수
			for (boolean b : num) {
				if (b) {
					cnt++;
				}
			}
			sb.append(cnt).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}