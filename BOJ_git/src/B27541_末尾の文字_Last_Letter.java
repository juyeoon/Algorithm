import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력받은 문자열의 끝에 'G'가 있으면 그 문자를 지우고, 없으면 끝에 'G'를 추가하여 출력하는 문제
// StringBuilder를 이용하여 문자열 조작
public class B27541_末尾の文字_Last_Letter {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 입력 문자열 길이
		String S = br.readLine(); // 입력 문자열
		sb.append(S); // 초기 문자열 저장
		if (S.charAt(N - 1) == 'G') { // 끝에 'G'가 있으면
			sb.setLength(N - 1); // 초기 문자열의 마지막 문자를 제거
		} else { // 끝에 'G'가 없으면
			sb.append("G"); // 'G' 추가
		}
		System.out.println(sb); // 변경된 문자열 추가
		br.close();
	}
}