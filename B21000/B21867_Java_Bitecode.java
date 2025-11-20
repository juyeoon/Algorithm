import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/21867
public class B21867_Java_Bitecode {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 문자열 길이
		String S = br.readLine(); // 코드
		for (int i = 0; i < N; i++) {
			char c = S.charAt(i); // 문자
			if (c == 'A' || c == 'J' || c == 'V') { // "JAVA" 무시
				continue;
			}
			sb.append(c);
		}
		System.out.println(sb.length() == 0 ? "nojava" : sb); // 출력
		br.close();
	}
}
