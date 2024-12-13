import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/28061
// ������ ���� �������� ������ �� �Ŀ� ���� �Ÿ���ŭ�� �� �͵� �߿� �ִ��� ã��
public class B28061_����_���� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // ���� ���� ����
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max = 0; // �ִ�� ������ �� �ִ� ���� ����
		for (int i = N; i > 0; i--) { // ���� ��ġ���� �������� �Ÿ�
			max = Math.max(max, Integer.parseInt(st.nextToken()) - i); // �ִ� ���� ���� ����
		}
		System.out.println(max); // ���
		br.close();
	}
}
