import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.math.BigInteger;

// https://www.acmicpc.net/problem/11368
// 한 책의 총 문자 수 = 한 줄의 문자 수 * 한 페이지의 줄 수 * 한 책의 페이지 수
// 총 경우의 수 = 가능한 문자의 수 ^ 한 책의 총 문자 수
// 수가 매우 커질 수 있으므로 BigInteger 사용
public class B11368_A_Serious_Reading_Problem {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("0 0 0 0")) { // EOI
			StringTokenizer st = new StringTokenizer(s);
			int C = Integer.parseInt(st.nextToken()); // 가능한 문자의 수
			int W = Integer.parseInt(st.nextToken()); // 한 줄의 문자의 수
			int L = Integer.parseInt(st.nextToken()); // 한 페이지의 줄 개수
			int P = Integer.parseInt(st.nextToken()); // 한 책의 페이지 수
			int leng = W * L * P; // 한 책의 총 문자 수
			sb.append(BigInteger.valueOf(C).pow(leng)).append("\n"); // 총 경우의 수
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
