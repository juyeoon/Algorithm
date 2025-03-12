import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// EOF 필요
// 0, 1, 나머지로 경우를 나누어서 계산
public class B1284_집_주소 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("0")) { // EOF
			int cnt = 1; // 길이 세기 - 왼쪽 공백 계산한 상태로 시작
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (c == '0') { // 0일 때
					cnt += 5; // 크기 4 + 오른쪽 공백 1
				} else if (c == '1') { // 1일 때
					cnt += 3; // 크기 2 + 오른쪽 공백 1
				} else { // 나머지
					cnt += 4; // 크기 3 + 오른쪽 공백 1
				}
			}
			sb.append(cnt).append("\n"); // 길이 sb에 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
