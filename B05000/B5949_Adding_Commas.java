import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/5949
// 방법1) 문자열을 잘라서 직접 `,` 넣기
// 입력 문자열(숫자)의 길이를 3으로 나눈 나머지를 먼저 앞에 출력 저장하고 콤마 입력
// 입력한 문자 이후의 문자들을 3개씩 출력 저장 후 콤마 입력
// 마지막에 출력하기 전에 마지막에 있는 콤마 삭제 후 출력
public class B5949_Adding_Commas {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] N = br.readLine().toCharArray(); // 입력 문자열(숫자)
		int first = N.length % 3; // 첫번째 콤마 앞의 숫자를 입력하기 위한 변수
		if (first != 0) { // 첫번째 콤마 앞에 숫자가 있음
			for (int i = 0; i < first; i++) { // 숫자 입력
				sb.append(N[i]);
			}
			sb.append(","); // 콤마 입력
		}
		for (int i = first; i < N.length; i += 3) { // 이후 숫자를 3개 + 콤마 형태로 출력 저장
			sb.append(N[i]).append(N[i + 1]).append(N[i + 2]).append(",");
		}
		sb.setLength(sb.length() - 1); // 맨 끝의 콤마 삭제
		System.out.println(sb); // 출력
		br.close();
	}
}
