import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 대분수의 자연수 부분 => (가분수의 분자 / 가분수의 분모)의 몫
// 대분수의 분자 => 가분수의 분자 - (자연수 부분 * 가분수의 분모)
// 대분수의 분모 => 가분수의 분모 (기약분수로 만들지 않음)
public class B10474_분수좋아해 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String s = "";
		while (!(s = br.readLine()).equals("0 0")) { // EOF
			st = new StringTokenizer(s);
			int numerator = Integer.parseInt(st.nextToken()); // 분자
			int denominator = Integer.parseInt(st.nextToken()); // 분모
			int share = numerator / denominator; // 자연수 부분
			sb.append(share).append(" "); // 자연수 부분
			sb.append(numerator - share * denominator).append(" / "); // 분자
			sb.append(denominator).append("\n"); // 분모
		}
		System.out.println(sb); // 출력
		br.readLine();
	}
}