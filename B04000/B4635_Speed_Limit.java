import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/4635
// �ӵ��� ���� ��� �ð��� �־����� �� �� �̵��� �Ÿ��� ���ϴ� ����
// ���� �ӵ������� ���� ��� �ð��� �����Ͽ� ���� �ӵ� * (���� ���� �ð� - ���� ���� �ð�)�� ���� = ���� �ӵ��� �̵��� �Ÿ�
// �ӵ��� �̵��� �Ÿ��� ��� ���� �� ���
public class B4635_Speed_Limit {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // �ӵ� ����
		while (N != -1) { // EOI
			int ctime = 0; // ���� ���� ��� �ð�
			int d = 0; // �� �̵� �Ÿ�
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int speed = Integer.parseInt(st.nextToken()); // ���� �ӵ�
				int time = Integer.parseInt(st.nextToken()); // ��������� ���� ��� �ð�
				d += speed * (time - ctime); // ���� �ӵ��� �̵��� �Ÿ�
				ctime = time; // ���� ���� ��� �ð� ����
			}
			sb.append(d).append(" miles\n"); // ��� ����
			N = Integer.parseInt(br.readLine()); // EOI��
		}
		System.out.println(sb); // ���
		br.close();
	}
}
