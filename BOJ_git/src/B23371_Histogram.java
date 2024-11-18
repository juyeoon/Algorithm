import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/23371
// �� ���� �� ������ ĳ���� ���� ���� => bin ���� ũ���� �迭�� [(������ �� - 1) / bin ũ��]�� �� + 1
// �׷����� ����� �����ϴ� ������ �迭�� ���� -> ���� �ݺ��ϸ� ���� ���� ä��
// . ���� => �׷����� �ִ� - ���� ��, # ���� => ������ ��
// ������ �迭�� �� -> �� �ݺ����� ��� ����
// �������� n��ŭ�� -�� �߰��Ͽ� ��� ���� ���߱�
public class B23371_Histogram {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // bin�� ����
		int s = Integer.parseInt(st.nextToken()); // bin �� ũ��
		int k = Integer.parseInt(st.nextToken()); // ������ ����
		int cnt[] = new int[n]; // �� ������ ������ ����
		st = new StringTokenizer(br.readLine()); // ������
		for (int i = 0; i < k; i++) {
			cnt[(Integer.parseInt(st.nextToken()) - 1) / s]++; // ī��Ʈ

		}
		int maxVal = 0; // �ִ� ������ ����
		for (int i : cnt) { // maxVal ���ϱ�
			maxVal = Math.max(maxVal, i);
		}
		char graph[][] = new char[maxVal][n]; // �׷���
		for (int j = 0; j < n; j++) { // ��
			int i = 0; // �� �ε���
			while (i < (maxVal - cnt[j])) { // .
				graph[i][j] = '.';
				i++;
			}
			while (i < maxVal) { // #
				graph[i][j] = '#';
				i++;
			}
		}
		for (int i = 0; i < maxVal; i++) { // ��� ����
			for (int j = 0; j < n; j++) {
				sb.append(graph[i][j]);
			}
			sb.append("\n");
		}
		for (int i = 0; i < n; i++) { // ��� ���� ���߱�
			sb.append('-');
		}
		System.out.println(sb); // ���
		br.close();
	}
}
