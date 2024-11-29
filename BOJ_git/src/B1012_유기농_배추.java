import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1012
// Ǯ��: dfs�� 4��(�������)���� ����� ���(�׷���)�� �� ������ Ȯ��
// ��������Ʈ�� ���� ����� ������� �ʰ� �׳� �־��� �迭���� ������� ���� �켱 Ž��
// main���� dfs() ������ �������� ī��Ʈ�Ͽ� ��� ������ ī��Ʈ
public class B1012_�����_���� {
	public static boolean[][] arr; // ���� �迭
	public static boolean[][] isvisited; // �湮 �迭
	public static int N, M; // �迭 ũ��
	public static int[] dx = { 0, 1, 0, -1 }; // ��� Ž�� i
	public static int[] dy = { -1, 0, 1, 0 }; // ��� Ž�� j

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // �׽�Ʈ���̽�
		for (int tc = 0; tc < T; tc++) { // �׽�Ʈ���̽�
			StringTokenizer st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken()); // ���� ũ��
			N = Integer.parseInt(st.nextToken()); // ���� ũ��
			int K = Integer.parseInt(st.nextToken()); // ���� ����
			arr = new boolean[N][M]; // ���� �迭 �ʱ�ȭ
			isvisited = new boolean[N][M]; // �湮 �迭 �ʱ�ȭ
			for (int i = 0; i < K; i++) { // ���� ��ġ
				st = new StringTokenizer(br.readLine());
				int y = Integer.parseInt(st.nextToken());
				int x = Integer.parseInt(st.nextToken());
				arr[x][y] = true; // ���� ǥ��
			}
			int cnt = 0; // ����(���, �׷���) ����
			for (int i = 0; i < N; i++) { // dfs ������ ã�� �ݺ���
				for (int j = 0; j < M; j++) {
					if (arr[i][j] && !isvisited[i][j]) { // ���߰� �ְ� �湮 �� ������
						dfs(i, j); // dfs ����
						cnt++; // �׷��� Ž�� ��, ī��Ʈ
					}
				}
			}
			sb.append(cnt).append("\n"); // ī��Ʈ ��� ����
		}
		System.out.println(sb); // ���
		br.close();
	}

	public static void dfs(int i, int j) { // dfs
		isvisited[i][j] = true; // �湮 ǥ��
		for (int l = 0; l < 4; l++) { // ��� Ž��
			int nexti = i + dx[l]; // ���� i
			int nextj = j + dy[l]; // ���� j
			// �迭 ������ ����� �ʰ�
			// ���߰� �ְ� �湮 �� ������ dfs
			if (0 <= nexti && nexti < N && 0 <= nextj && nextj < M && arr[nexti][nextj] && !isvisited[nexti][nextj]) {
				dfs(nexti, nextj);
			}
		}
	}
}
