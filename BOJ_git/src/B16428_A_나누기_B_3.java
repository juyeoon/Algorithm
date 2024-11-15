import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/16428
// 수의 범위가 -10^10000 ≤ A, B ≤ 10^10000이므로 BigInteger 사용
// 나머지 => A - (B * 몫)
// 몫
// 양수/양수 => A/B
// 양수/음수 => -(|A|/|B|) = -(A/(-B))
// 음수/양수 => -(|A|/|B|+1) = -((-A)/(B)+1)
// 음수/음수 => |A|/|B|+1 = (-A)/(-B)+1
public class B16428_A_나누기_B_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		String astring = st.nextToken(); // A값 (String)
		String bstring = st.nextToken(); // B값 (String)
		boolean asign = astring.charAt(0) == '-' ? false : true; // A의 부호 (true: 양수)
		boolean bsign = bstring.charAt(0) == '-' ? false : true; // B의 부호 (true: 양수)
		BigInteger A = new BigInteger(astring); // A값 (숫자)
		BigInteger B = new BigInteger(bstring); // B값 (숫자)
		BigInteger d = null; // 몫
		if (asign && bsign) { // 양수/양수
			d = A.divide(B); // A/B
		} else if (asign) { // 양수/음수
			d = A.divide(B.negate()).negate(); // -(A/(-B))
		} else if (bsign) { // 음수/양수
			d = A.negate().divide(B).add(BigInteger.ONE).negate(); // -((-A)/(B)+1)
		} else { // 음수/음수
			d = A.negate().divide(B.negate()).add(BigInteger.ONE); // (-A)/(-B)+1
		}
		sb.append(d).append("\n").append(A.subtract(B.multiply(d))); // 몫, 나머지 출력 저장
		System.out.println(sb); // 출력
		br.close();
	}
}