import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/32246
// N�� 3 �̻��̸� ù��° ĭ�� ������ ĭ�� ĥ�ϰ� ��� ���� '/'���·� �밢���� ĥ�ϸ� �� => Nĭ
// N�� 1�̸� �� ĭ ĥ�ϱ� => Nĭ
// N�� 2�̸�  ù��° ĭ�� ������ ĭ�� ĥ�ϸ� '/' �밢�ǿ��� ���� ���� ������ �� ĭ�� �� ĥ����� �� => 3ĭ
public class B32246_����_���� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(N == 2 ? 3 : N); // 2ĭ�� ���� �ٸ��� ���
		br.close();
	}
}
