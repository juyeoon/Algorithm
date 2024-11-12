import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/16428
// ���� ������ -10^10000 �� A, B �� 10^10000�̹Ƿ� BigInteger ���
// ������ => A - (B * ��)
// ��
// ���/��� => A/B
// ���/���� => -(|A|/|B|) = -(A/(-B))
// ����/��� => -(|A|/|B|+1) = -((-A)/(B)+1)
// ����/���� => |A|/|B|+1 = (-A)/(-B)+1
public class B16428_A_������_B_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		String astring = st.nextToken(); // A�� (String)
		String bstring = st.nextToken(); // B�� (String)
		boolean asign = astring.charAt(0) == '-' ? false : true; // A�� ��ȣ (true: ���)
		boolean bsign = bstring.charAt(0) == '-' ? false : true; // B�� ��ȣ (true: ���)
		BigInteger A = new BigInteger(astring); // A�� (����)
		BigInteger B = new BigInteger(bstring); // B�� (����)
		BigInteger d = null; // ��
		if (asign && bsign) { // ���/���
			d = A.divide(B); // A/B
		} else if (asign) { // ���/����
			d = A.divide(B.negate()).negate(); // -(A/(-B))
		} else if (bsign) { // ����/���
			d = A.negate().divide(B).add(BigInteger.ONE).negate(); // -((-A)/(B)+1)
		} else { // ����/����
			d = A.negate().divide(B.negate()).add(BigInteger.ONE); // (-A)/(-B)+1
		}
		sb.append(d).append("\n").append(A.subtract(B.multiply(d))); // ��, ������ ��� ����
		System.out.println(sb); // ���
		br.close();
	}
}
