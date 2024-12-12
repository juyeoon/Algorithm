import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/11312
// ū �ﰢ�� �� ���� ���� �� �ִ� ���� �ﰢ���� �� ���� ���� ���� ��
// = (A / B)^2
public class B11312_�ﰢ_����_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // �׽�Ʈ���̽�
		for (int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long side = Integer.parseInt(st.nextToken()) / Integer.parseInt(st.nextToken()); // �� ���� ���� ���� ���� �ﰢ���� ���� ����
			sb.append(side * side).append("\n"); // �ﰢ���� ���� ���� ���� �ﰢ���� ����
		}
		System.out.println(sb); // ���
		br.close();
	}
}
