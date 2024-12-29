import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/12782
// ���� ���� = ���ڸ� �ٲ�� �ϴ� ���� + (�ڸ��� �ٲ�� �ϴ� ���� / 2)
// = |(N�� 1�� ���� - M�� 1�� ����)| + (���� �ٸ� �ڸ� �� ���� - ���ڸ� �ٲ�� �ϴ� ����) / 2
public class B12782_��Ʈ_�������� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // �׽�Ʈ ���̽�
		for (int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char N[] = st.nextToken().toCharArray(); // ù��° ������
			char M[] = st.nextToken().toCharArray(); // �ι�° ������
			int cntOneN = 0; // ù��° �������� 1�� ����
			int cntOneM = 0; // �ι�° �������� 1�� ����
			int diffCnt = 0; // ���� �ڸ� ���� ���� �ٸ� �ڸ� ���� ����
			for (int i = 0; i < M.length; i++) { // �� ���� �� ���ϱ�
				if (N[i] == '1') {
					cntOneN++;
				}
				if (M[i] == '1') {
					cntOneM++;
				}
				if (N[i] != M[i]) {
					diffCnt++;
				}
			}
			// ���� ���� = ���ڸ� �ٲ�� �ϴ� ���� + (�ڸ��� �ٲ�� �ϴ� ���� / 2)
			sb.append(Math.abs(cntOneN - cntOneM) + (diffCnt - Math.abs(cntOneN - cntOneM)) / 2).append("\n");
		}
		System.out.println(sb); // ���
		br.close();
	}
}
