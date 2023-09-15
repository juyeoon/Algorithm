import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열의 문자를 뒤에서부터 확인하면서 대응하는 숫자로 변환 후 8의 제곱(1부터 8씩 곱한 값)을 곱하고 총 합에 추가
public class B1864_문어_숫자 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("#")) { // EOF
			int ans = 0; // 계산식 값
			int eight = 1; // 8의 제곱수
			for (int i = s.length() - 1; i >= 0; i--) { // 문자열 뒤에서부터 확인
				char c = s.charAt(i);
				int num = 0; // 문자의 숫자
				if (c == '\\') {
					num = 1;
				} else if (c == '(') {
					num = 2;
				} else if (c == '@') {
					num = 3;
				} else if (c == '?') {
					num = 4;
				} else if (c == '>') {
					num = 5;
				} else if (c == '&') {
					num = 6;
				} else if (c == '%') {
					num = 7;
				} else if (c == '/') {
					num = -1;
				}
				ans += eight * num; // 계산식에 값  더하기
				eight *= 8; // 8의 제곱수 값 갱신
			}
			sb.append(ans).append("\n"); // 출력에 추가
		}
		System.out.println(sb); // 출력
		br.close();
	}
}