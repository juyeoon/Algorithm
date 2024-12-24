import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/21734
// ����ȯ���� ���ڸ� ���������� �ٲ� �� %10, /10�� �̿��Ͽ� �� �ڸ� ���� ���� ���ϰ�
// �ݺ������� �ո�ŭ ���� ���
public class B21734_SMUPC��_���� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char c[] = br.readLine().toCharArray(); // �־����� �ܾ�
		for (int i = 0; i < c.length; i++) {
			int n = (int) c[i]; // ascii �ڵ� ���� 10��������
			int cnt = 0; // �� �ڸ� ���� ��
			while (n > 0) { // �� ���ϱ�
				cnt += n % 10;
				n /= 10;
			}
			for (int j = 0; j < cnt; j++) { // �� �ڸ� ���� �ո�ŭ ���� ���
				sb.append(c[i]);
			}
			sb.append("\n");
		}
		System.out.println(sb); // ���
		br.close();
	}
}
