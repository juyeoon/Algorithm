import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/16675
// �� ���� ������� ���� ������ ���ϰ� �ݴ����� ����� �޼�, ������ 2���� ���ؼ� �� �� �̱� �� ������ ������ �¸���
public class B16675_��_����_�� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		char mt[][] = { { st.nextToken().charAt(0), st.nextToken().charAt(0) },
				{ st.nextToken().charAt(0), st.nextToken().charAt(0) } }; // ���������� ����
		int winner = 2; // ������ �̱�� ��� (0: �μ�, 1: �°�, 2: ����)
		Loop: for (int i = 0; i < 2; i++) { // �μ� -> �°�
			for (int j = 0; j < 2; j++) { // �޼� -> ������
				char now = mt[i][j]; // ���� ��
				int idx = 1 - i; // ���� ���� �� ����� �ݴ� ���
				boolean win = true; // ������ �̱�� true
				for (int k = 0; k < 2; k++) { // ���� �� �ݴ� ����� �޼� -> ������
					// ���ų� ���� �̱� �� ����
					if (now == 'R') {
						if (mt[idx][k] == 'P' || mt[idx][k] == 'R') {
							win = false;
							break;
						}
					} else if (now == 'S') {
						if (mt[idx][k] == 'R' || mt[idx][k] == 'S') {
							win = false;
							break;
						}
					} else {
						if (mt[idx][k] == 'S' || mt[idx][k] == 'P') {
							win = false;
							break;
						}
					}
				}
				if (win) { // �ݴ� ����� ��� ���� �̱� �� ������
					winner = i; // ����ڴ� ���� ���� �� ���
					break Loop;
				}
			}
		}
		if (winner == 0) { // �μ�
			System.out.println("MS");
		} else if (winner == 1) { // �°�
			System.out.println("TK");
		} else { // ������ �̱� �� ����
			System.out.println("?");
		}
		br.close();
	}
}
