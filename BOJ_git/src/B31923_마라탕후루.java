import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// �ݺ������� 10000�� ������ �� �� �� ������ ����� ���θӽ�Ĺ ������ �÷��� ������ �ݺ��� Ż��
// 10000�� �ߴµ��� ������ ���� ������ �Ұ��� �Ǵ�
// �Ұ��� �ϸ� NO, �����ϸ� ��ġ������ ���� �ൿ Ƚ�� ���
public class B31923_�������ķ� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // ���ķ� ��ġ ����
		int P = Integer.parseInt(st.nextToken()); // �κ��� 1�и��� �ȴ� ������ ����
		int Q = Integer.parseInt(st.nextToken()); // ���θӽ�Ĺ�� ����
		StringTokenizer stA = new StringTokenizer(br.readLine()); // �����ִ� ���� ����
		StringTokenizer stB = new StringTokenizer(br.readLine()); // �����ִ� ���θӽ�Ĺ ����
		boolean possible = true; // ��ġ���� ����� ���θӽ�Ĺ�� ������ �Ȱ��� ���� �� �ִ��� ���� (true: ���� �� ����)
		for (int i = 0; i < N; i++) { // ��ġ ������ŭ �ݺ�
			int A = Integer.parseInt(stA.nextToken()); // ���� ��ġ�� �����ִ� ���� ����
			int B = Integer.parseInt(stB.nextToken()); // ���� ��ġ�� �����ִ� ���θӽ�Ĺ ����
			int cnt = 0; // �κ��� �ȴ� �ൿ�� �� �� �ߴ���
			while (cnt < 10001) { // 10000�� �̳��� ����
				if (A == B) { // ����� ���θӽ�Ĺ ������ ��������
					sb.append(cnt).append(" "); // �� �� �ȾҴ��� ���
					break;
				}
				// ������ ���� ���� ��
				A += P; // ���� �ȱ�
				B += Q; // ���θӽ�Ĺ �ȱ�
				cnt++; // ī��Ʈ ����
			}
			if (cnt == 10001) { // 10000�� �ߴµ��� ������ ���� ������
				possible = false; // �Ұ���
				break; // �ڿ� �� �� �ʿ� ����
			}
		}
		if (possible) { // �����ϸ�
			System.out.println("YES");
			System.out.println(sb);
		} else { // �Ұ����ϸ�
			System.out.println("NO");
		}
		br.close();
	}
}
