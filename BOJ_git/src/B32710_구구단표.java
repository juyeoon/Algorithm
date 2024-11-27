import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/3181
// 2���� 9���� �ش� ���ڸ� �������� �� �������� 0�̰� ���� 2~9 ���̸� �����ϴ� ��
// ���� ������ ��(axb)���� 1~9���� �����ϱ� ������ �ش� ���� ���̸� ����
public class B32710_������ǥ {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // �Է� ���� ��
		boolean ap = false; // ���� ���� (true: ����)
		if (N < 10) { // ������ �Ŀ� ������
			ap = true;
		}
		for (int i = 2; i <= 9; i++) { // 2~9�� Ȯ��
			if (N % i == 0 && N / i <= 9) { // �������� 0�̰� ���� 2~9�� ��
				ap = true; // ����
				break; // �� Ȯ�� �ʿ� x
			}
		}
		System.out.println(ap ? 1 : 0); // ���
		br.close();
	}
}
