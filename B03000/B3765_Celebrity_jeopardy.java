import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 받은 그대로 출력하는 문제
// EOF 사용
public class B3765_Celebrity_jeopardy {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while ((s = br.readLine()) != null) { // EOF
			sb.append(s).append("\n"); // 입력 받은 그대로 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}