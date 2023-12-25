import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 문자열의 마지막 문자가 '.'이 아니면 문자열에 '.'을 추가하여 출력
public class B26560_Periods {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 입력 문자열 개수
		for (int i = 0; i < n; i++) {
			String s = br.readLine(); // 입력 문자열
			sb.append(s); // 문자열 출력 저장
			if (s.charAt(s.length() - 1) != '.') { // 입력 문자열의 마지막 문자가 '.'이 아니면
				sb.append("."); // 문자열에 '.'을 추가
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}