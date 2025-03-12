import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/33163
// J -> O, O -> I, I -> J로 변환하여 출력
public class B33163_OIJ_OIJ {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 문자열 길이
		String s = br.readLine(); // 문자열
		for (int i = 0; i < N; i++) { // 변환
			char c = s.charAt(i);
			if (c == 'J') {
				sb.append("O");
			} else if (c == 'O') {
				sb.append("I");
			} else {
				sb.append("J");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
