import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/4864
// �迭�� �������� ����
// ó������ 10000���� �� �������� �ʰ� �Է� ���� ������ ����Ͽ� ���
// ���� �Է� ������ ����� ���� �ʾ����� ���������� ����� ������ �Է� ������ ����Ͽ� ���
public class B4864_Gold_Coins {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		int sum[] = new int[10001]; // idx������ ������
		int lastIdx = 0; // ����� ������ ��
		int lastSum = 0; // ������ ����� �� ���� ��
		while (!(s = br.readLine()).equals("0")) { // EOI
			int n = Integer.parseInt(s); // n��
			sb.append(n).append(" ");
			if (n > lastIdx) { // n�� ���� ������ �ʾ��� ��
				while (n >= lastIdx) { // ���� ������ �ݺ�
					lastSum++; // ���� �� ����
					for (int i = 0; i < lastSum; i++) { // ���� ����ŭ ���� �� ���ϱ�
						if (++lastIdx > 10000) { // �迭 �ε��� ���� Ȯ��
							break;
						}
						sum[lastIdx] += sum[lastIdx - 1] + lastSum; // ������ ���ϱ�
					}
				}
			}
			sb.append(sum[n]).append("\n"); // n���� ����� �Ǿ��� �� ���
		}
		System.out.println(sb); // ���
		br.close();
	}
}
