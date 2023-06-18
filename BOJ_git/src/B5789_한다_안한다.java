import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 문자열의 가운데 두 문자에 따라서 결과가 달라짐
// 가운데 두 문자의 index => (문자열의 길이 / 2 - 1), (문자열의 길이 / 2)
public class B5789_한다_안한다 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 입력 문자열 개수
		for (int i = 0; i < N; i++) {
			String s = br.readLine(); // 문자열
			int c1 = s.charAt(s.length() / 2 - 1); // 가운데 문자
			int c2 = s.charAt(s.length() / 2); // 가운데 문자
			sb.append((c1 == c2) ? "Do-it\n" : "Do-it-Not\n"); // 문자 비교
		}
		System.out.println(sb); // 출력
		br.readLine();
	}
}