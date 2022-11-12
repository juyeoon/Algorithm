import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// String.toLowerCase() 사용해서 소문자로 변경
public class B5524_입실_관리 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 문자열 개수
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			sb.append(s.toLowerCase()).append("\n"); // 소문자로
		}
		System.out.println(sb); // 출력
		br.close();
	}
}