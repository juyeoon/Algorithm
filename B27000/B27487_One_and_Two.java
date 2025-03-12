import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/27487
// 1�� 2�� �̷���� ������ ���� �� a_1*a_2*...*a_k = a_(k+1) * a_(k+2) * ... * a_n�� ���� �ϴ� k�� �ּҸ� ���ϴ� ����
// ������ 1�� ������ ���� ������ ��ü ������ 2�� ������ ���ϰ� 
// 2�� ������ Ȧ���� � k�� ������ �� ����
// 2�� ������ ¦���� �ٽ� ��ü ������ ��ȸ�ϸ鼭 2�� ������ ī��Ʈ�Ͽ� ī��Ʈ�� 2�� ������ 2�� ���� ���� ������ ���� k�� �ּڰ�
public class B27487_One_and_Two {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // �׽�Ʈ���̽�
		for (int tc = 0; tc < T; tc++) {
			int N = Integer.parseInt(br.readLine()); // �� ����
			StringTokenizer st = new StringTokenizer(br.readLine());
			boolean a[] = new boolean[N + 1]; // true: 2, false: 1
			int twoCnt = 0; // 2�� ����
			for (int i = 1; i <= N; i++) { // 2�� ���� ����
				if (Integer.parseInt(st.nextToken()) == 2) {
					a[i] = true;
					twoCnt++;
				}
			}
			if (twoCnt % 2 == 1) { // 2�� Ȧ������ �Ұ���
				sb.append("-1\n");
			} else { // 2�� ¦������
				// ��ü ������ ��ȸ�ϸ鼭 2�� ������ ī��Ʈ�Ͽ�
				// ī��Ʈ�� 2�� ������ 2�� ���� ���� ������ ���� k�� �ּڰ�
				twoCnt /= 2;
				int idx = 0;
				if (twoCnt == 0) {
					idx = 1;
				}
				while (twoCnt > 0) {
					if (a[++idx]) {
						twoCnt--;
					}
				}

				sb.append(idx).append("\n");
			}
		}
		System.out.println(sb); // ���
		br.close();
	}
}
