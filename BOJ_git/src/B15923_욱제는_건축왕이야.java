import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/15923
// ���ӵǾ� �ִ� �������� �־����Ƿ� ������ ������ ������ �Ÿ��� ���ؼ� ���ϱ�
// ������ �������� ù��° ���������� �Ÿ��� �߰��ؾ� ��
public class B15923_������_������̾� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // ������ ����
		int sum = 0; // �ѷ�
		int vertex[][] = new int[N][2]; // ������ ��ǥ
		StringTokenizer st = new StringTokenizer(br.readLine());
		vertex[0][0] = Integer.parseInt(st.nextToken()); // ù ��° ������
		vertex[0][1] = Integer.parseInt(st.nextToken());
		for (int i = 1; i < N; i++) { // �� ��° ���������� ������ ����������
			st = new StringTokenizer(br.readLine());
			vertex[i][0] = Integer.parseInt(st.nextToken()); // i��° ������
			vertex[i][1] = Integer.parseInt(st.nextToken());
			// i��° �������� �� ���� ������ ������ �Ÿ��� ����
			sum += Math.abs(vertex[i][0] - vertex[i - 1][0] + vertex[i][1] - vertex[i - 1][1]);
		}
		// ������ �������� ù��° ������ ������ �Ÿ��� ����
		sum += Math.abs(vertex[0][0] - vertex[N - 1][0] + vertex[0][1] - vertex[N - 1][1]);
		System.out.println(sum); // ���
		br.close();
	}
}
