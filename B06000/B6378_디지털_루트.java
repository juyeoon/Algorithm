import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열 길이 만큼 반복하여 더하기
// 10 이하될 때까지 반복
public class B6378_디지털_루트 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = ""; // 처음 숫자
		while (!(s = br.readLine()).equals("0")) {
			int sum = 0; // 자리 수 합
			do {
				sum = 0;
				for (int i = 0; i < s.length(); i++) {
					char c = s.charAt(i);
					sum += c - 48; // 문자를 숫자로 변환
				}
				s = Integer.toString(sum); // 문자열 갱신
			} while (sum >= 10); // 10 미만이 될 때까지 반복
			sb.append(s).append("\n"); 
		}
		System.out.println(sb); // 출력
		br.close();
	}
}