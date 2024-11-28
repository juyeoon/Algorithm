import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/3181
// �濡 �ִ� ������ ¦ ������ (��ü �� - ���� ��)
// 2���� ¦ ������ �� ���� �� => 2�� ���� �� ���
// 2���� ¦ ������ �� ���� ��
// => 1���� �� => 2�� �׷� X, 3�� �׷� X
// => 3�� �̻� �� �� => 2�� �׷� = 2�� ���� �� - 1, 3�� �׷� 1��(����)
public class B5102_Sarahs_Toys {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("0 0")) { // EOI
			StringTokenizer st = new StringTokenizer(s);
			int remain = Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken()); // �濡 �ִ� ���� ��
			if (remain == 1) { // 1���� ���� ¦�� ���� �� ����
				sb.append("0 0\n");
			} else if (remain % 2 == 1) { // 2���� ¦ ������ �� ���� ��
				sb.append(remain / 2 - 1).append(" 1\n"); // �� ���� ¦�� 1���� �� �־� 3�� �׷����� ����
			} else { // 2���� ¦ ������ �� ���� ��
				sb.append(remain / 2).append(" 0\n");
			}
		}
		System.out.println(sb); // ���
		br.close();
	}
}
