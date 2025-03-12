import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 받은 문자열의 첫 문자가 대문자면 그대로 출력
// 소문자면 32를 빼서(소문자 변환) 출력
// subString으로 1번 인덱스 부터 끝까지 출력 후 개행
public class B4458_첫_글자를_대문자로 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 문자열 개수
		for (int i = 0; i < N; i++) {
			String str = br.readLine(); // 입력 문자열
			char first = str.charAt(0); // 첫 문자
			if (first < 97) { // 대문자면 그대로
				sb.append(first);
			} else { // 소문자면 대문자로
				sb.append((char) (first - 32));
			}
			sb.append(str.substring(1)).append("\n"); // 첫 문자 빼고 뒤의 문자열 추가
		}
		System.out.println(sb); // 출력
		br.close();
	}
}