import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 직전 문자와 현재 연속 길이, 최대 연속 길이를 저장하여 조건에 맞게 갱신
public class B2495_연속구간 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 3; i++) { // 입력 줄 수
			String s = br.readLine(); // 입력 문자열
			int maxCnt = 1; // 최대 연속 길이
			int cnt = 1; // 현재 연속 길이
			char num = s.charAt(0); // 직전 문자
			for (int j = 1; j < 8; j++) { 
				if (num == s.charAt(j)) { // 직전 문자와 같으면
					cnt++; // 현재 연속 길이 + 1
					maxCnt = Math.max(maxCnt, cnt); // 최대 연속 길이 갱신
				} else { // 직전 문자와 다르면
					cnt = 1;  // 현재 연속 길이 리셋
					num = s.charAt(j); // 직전 문자 리셋
				}
			}
			sb.append(maxCnt).append("\n"); // 최대 연속 길이 추가
		}
		System.out.println(sb); // 출력
		br.close();
	}
}