import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// �Է� ���ڿ� ���� üũ
public class B25372_��������_������_��й�ȣ {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // ��й�ȣ ����
		for (int tc = 0; tc < N; tc++) {
			String s = br.readLine(); // ��й�ȣ ���ڿ�
			if (s.length() >= 6 && s.length() <= 9) { // 6�� �̻� 9�� ����
				sb.append("yes\n");
			} else {
				sb.append("no\n");
			}
		}
		System.out.println(sb); // ���
		br.close();
	}
}
