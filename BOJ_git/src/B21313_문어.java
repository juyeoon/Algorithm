import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// �׸��� ������� ���� �տ� ���ĵǴ� ���� �ִ��� 2���� ������ �� �� ���� �� 1 2 ���
// �ϳ��� ������(���� ���� Ȧ����) 3(1�� �̹� ��� ������ ������ ���� 3) ���
public class B21313_���� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // ���� ����
		for (int i = 0; i < N - 1; i += 2) { // ��� ���ڸ��� ���� ������ 2���� ��� 1 2 ���
			sb.append("1 2 ");
		}
		if (N % 2 == 1) { // ���� ��� ������ 3
			sb.append("3 ");
		}
		System.out.println(sb); // ���
		br.close();
	}
}
