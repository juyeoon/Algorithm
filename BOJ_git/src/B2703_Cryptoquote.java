import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2703
// ��ȯ ��Ģ�� char �迭�� ���� �� ��ȣ���� �ε����� �ٲ㼭 ��¹��� �߰�
public class B2703_Cryptoquote {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // �׽�Ʈ���̽�
		for (int tc = 0; tc < T; tc++) {
			String s = br.readLine(); // ��ȣ �޽���
			char cryp[] = br.readLine().toCharArray(); // ��ȯ ��Ģ
			int leng = s.length();
			for (int i = 0; i < leng; i++) { // ��ȯ
				if (s.charAt(i) == ' ') { // ���� ��ŵ
					sb.append(" ");
				} else { // ��ȯ
					sb.append(cryp[s.charAt(i) - 'A']);
				}
			}
			sb.append("\n");
		}
		System.out.println(sb); // ���
		br.close();
	}
}
