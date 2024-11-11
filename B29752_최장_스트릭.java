import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/29752
// 0�� ���� ������ ���� ��Ʈ���� ī���� �ϴٰ� 0�� ������ �׶��� �ִ� Ȯ���Ͽ� �����ϰ� ���� ��Ʈ���� 0���� ����
// �ݺ����� ������ �ִ��� �� �� Ȯ���Ͽ� ���� �ʿ�. ������ ���� ��Ʈ���� ���� ��Ʈ���� ������ �� �Ʊ� ����
public class B29752_����_��Ʈ�� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // N��
		StringTokenizer st = new StringTokenizer(br.readLine());
		int ans = 0; // ���� ��Ʈ��
		int tmp = 0; // ���� ��Ʈ��
		for (int i = 0; i < N; i++) {
			int x = Integer.parseInt(st.nextToken()); // Ǭ ���� ����
			if (x == 0) { // Ǭ ������ 0�̸�
				ans = Math.max(ans, tmp); // �ִ� ����
				tmp = 0; // ���� ��Ʈ�� ����
			} else { // Ǭ ������ ������
				tmp++; // ���� ��Ʈ�� ī��Ʈ
			}
		}
		ans = Math.max(ans, tmp); // �ݺ����� ������ �� �� �� �ִ� ����
		System.out.println(ans); // ���
		br.close();
	}
}
