import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B21966_괄호_중략_괄호 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 글자수
		String S = br.readLine(); // 문자열
		if (N <= 25) { // 25개 이하면 문자열 출력
			System.out.println(S);
		} else { // 25개 초과면
			boolean dot = false; // 중간(앞 11글자, 뒤 11글자 사이)에 점이 있으면(앞뒤 한글자 제외) 한 문장이 아님
			for (int i = 12, j = N - 13; i <= j; i++, j--) { // 앞(문자열 12글자 뒤)에서부터 확인 & 뒤(문자열 뒤에서 12글자)에서부터 확인
				if (S.charAt(i) == '.' || S.charAt(j) == '.') {
					dot = true; // 온점이 있음
					break; // 하나라도 있으면 반복문 탈출
				}
			}
			if (!dot) { // 한 문장이면
				String s1 = S.substring(0, 11); // 앞 문자열
				String s2 = S.substring(N - 11); // 뒤 문자열
				sb.append(s1).append("...").append(s2); // 사이에 ... 삽입
			} else { // 두 문장 이상이면
				String s1 = S.substring(0, 9); // 앞 문자열
				String s2 = S.substring(N - 10); // 뒤 문자열
				sb.append(s1).append("......").append(s2); // 사이에 ...... 삽입
			}
			System.out.println(sb); // 출력
		}

	}
}
