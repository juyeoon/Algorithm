import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/14467
// ���� ��ȣ�� ���� ��ġ�� �����ϰ� ���� ��ġ�� �Է� ��ġ�� �ٸ��� ī��Ʈ�� ���� ��ġ ����
public class B14467_�Ұ�_����_�ǳʰ�_����_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // ���� Ƚ��
		int cowloc[] = new int[11]; // ���� ���� ��ġ
		for (int i = 1; i <= 10; i++) { // �ʱ�ȭ
			cowloc[i] = -1;
		}
		int cnt = 0; // �Ұ� �� �ǳ� Ƚ��
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken()); // �� ��ȣ
			int loc = Integer.parseInt(st.nextToken()); // �� ��ġ
			if (cowloc[num] == -1) { // �Ұ� ó�� �������� ��
				cowloc[num] = loc; // ��ġ ����
			} else if (cowloc[num] != loc) { // �Է� ���� ��ġ�� �ٸ� ��ġ�� �� �̵�
				cnt++;
				cowloc[num] = loc;
			}
		}
		System.out.println(cnt); // ���
		br.close();
	}
}
