import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/26502
// 평문 소문자, 대문자를 String으로 저장하고 매칭 순서에 맞게 암호문 소문자, 암호문대문자 String을 저장
// indexOf으로 바뀐 소문자와 대문자가 있는지 확인 후 있으면 매칭되는 대소문자로 변경
public class B26502_Decoder {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 암호문 개수
		String originalLower = "aeiouy"; // 평문 소문자
		String originalUpper = "AEIOUY"; // 평문 대문자
		String replacementLower = "yaeiou"; // 암호문 소문자
		String replacementUpper = "YAEIOU"; // 암호문 대문자
		for (int i = 0; i < n; i++) {
			for (char c : br.readLine().toCharArray()) { // 암호문의 문자 하나씩 확인
				int idx = replacementLower.indexOf(c); // 바뀐 소문자가 있는지 확인
				if (idx != -1) { // 있으면
					sb.append(originalLower.charAt(idx)); // 매칭되는 평문 소문자로 변경
				} else if ((idx = replacementUpper.indexOf(c)) != -1) { // 바뀐 대문자가 있는지 확인
					sb.append(originalUpper.charAt(idx)); // 매칭되는 평문 대문자로 변경
				} else { // 매칭되는게 없으면 그대로
					sb.append(c);
				}
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
