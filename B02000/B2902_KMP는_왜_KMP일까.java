import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 제일 처음 문자를 출력 후 '-'가 나오면 그 다음 문자를 출력
public class B2902_KMP는_왜_KMP일까 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine(); // 긴 이름
		sb.append(s.charAt(0)); // 첫 문자
		for (int i = 1; i < s.length(); i++) { // 두 번째 문자부터 반복
			if (s.charAt(i) == '-') { // '-' 나오면
				sb.append(s.charAt(++i)); // 다음 문자 추가
			}
		}
		System.out.println(sb); // 짧은 이름 출력
		br.close();
	}
}