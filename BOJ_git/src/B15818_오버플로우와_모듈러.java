import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/15818
// (A �� B) % M = ((A % M) �� (B % M)) % M
// �������� ���� ���� �� �� �� �� ������ ������ ������ ����ŭ �ݺ�
public class B15818_�����÷ο��_��ⷯ {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // ������ ����
		int M = Integer.parseInt(st.nextToken()); // ������ ������ ��
		long sum = 1; // ���� ���� ������ = ������ ���� ���� ������
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) { // ������ ����
			int a = Integer.parseInt(st.nextToken()) % M; // ������ ������
			sum *= a; // �信 ���ϱ�
			sum %= M; // �� ������ ���ϱ�
		}
		System.out.println(sum); // ���
		br.close();
	}
}
