import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 대소문자를 무시하고 String 정렬하기
// str1.compareToIgnoreCase(str2) 사용
// => str1이 앞에 있는 경우, 음수
// str1이 뒤에 있는 경우, 양수
// 같은 경우, 0 리턴
public class B2204_도비의_난독증_테스트 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("0")) { // EOI
			int N = Integer.parseInt(s); // 문자열 개수
			String first = br.readLine(); // 가장 앞에 있는 문자열
			for (int i = 1; i < N; i++) {
				String now = br.readLine(); // 비교할 문자열
				int cp = first.compareToIgnoreCase(now); // 대소문자 무시하고 비교
				if (cp > 0) { // `first` 갱신
					first = now;
				}
			}
			sb.append(first).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}