import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/16019
// ������ ���� ���ӵ� ���� �� ������ �Ÿ��� �־����� �� �� ���� ������ �Ÿ�ǥ�� �ۼ��ϴ� ����
// 0�������� �� ���ñ����� �Ÿ�(��, ��ǥ)�� ���� �� ��ǥ���� �� ���� ���
public class B16019_Are_we_there_yet {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = 4; // ���� 4��
		int city[] = new int[N + 1]; // ������ ��ǥ
		for (int i = 1; i <= N; i++) { // city[] ���ϱ�
			city[i] = city[i - 1] + Integer.parseInt(st.nextToken());
		}
		int dis[][] = new int[N + 1][N + 1]; // ���� ������ �Ÿ�ǥ
		for (int i = 0; i < N; i++) { // �Ÿ�ǥ ä���
			for (int j = i + 1; j <= N; j++) {
				int tmp = city[j] - city[i]; // �� ���� ������ �Ÿ�
				dis[i][j] = tmp; // �Ÿ�ǥ�� ���
				dis[j][i] = tmp;
			}
		}
		for (int i = 0; i <= N; i++) { // ��� ����
			for (int j = 0; j <= N; j++) {
				sb.append(dis[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb); // ���
		br.close();
	}
}
