import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 받은 문자열의 문자에 + 1을 한 다음 char형으로 바꾸기
// 'Z'는 'A'가 되어야 하므로 삼항연산자로 조건 분기
public class B6321_IBM_빼기_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 문자열 개수
		for (int i = 1; i <= N; i++) {
			String s = br.readLine(); // 입력 받은 문자열
			sb.append("String #").append(i).append("\n"); // 출력 형식 맞추기
			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j); // 문자열의 문자
				sb.append((c == 'Z') ? "A" : (char) (c + 1)); // 문자에 + 1을 한 다음 char형으로 바꾸기('Z' 예외처리 하기)
			}
			sb.append("\n\n"); // 출력 형식 맞추기
		}
		System.out.println(sb); // 출력
		br.close();
	}
}