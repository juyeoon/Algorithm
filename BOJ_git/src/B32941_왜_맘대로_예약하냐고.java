import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/32941
// boolean ������ ����ؼ� �ǿ찡 ������ ���ÿ� ��� ������ ������ �� �ִ��� Ȯ��
// �� ������ ������ ���ÿ� �ǿ찡 ������ ���ð� ������ ��� ���� ���� �Ұ�
// ������ ���� ���� Ȯ��
public class B32941_��_�����_�����ϳİ� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken()); // ������ ������ �� �ִ� ������ ����
		int X = Integer.parseInt(st.nextToken()); // �ǿ찡 ������ ����
		int N = Integer.parseInt(br.readLine()); // ������ ��
		boolean possible = true; // �ǿ찡 ������ ���ÿ� ��� ������ ������ �� �ִ��� (true: ����)
		for (int i = 0; i < N; i++) {
			int K = Integer.parseInt(br.readLine()); // ������ ������ �� �ִ� ������ ����
			st = new StringTokenizer(br.readLine());
			boolean exist = false; // �ش� ������ �ǿ찡 ������ ���ÿ� ������ �� �ִ��� (true: ����)
			for (int j = 0; j < K; j++) {
				if (Integer.parseInt(st.nextToken()) == X) { // �����ϸ�
					exist = true; // ���� ����
					break;
				}
			}
			if (!exist) { // �������� ������
				possible = false; // ��� ���� ���� �Ұ�
				break;
			}
		}
		System.out.println(possible ? "YES" : "NO"); // ���
		br.close();
	}
}