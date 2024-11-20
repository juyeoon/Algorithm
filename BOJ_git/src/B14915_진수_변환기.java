import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/14915
// 10������ n������ �ٲٴ� ��� => 10������ n���� ���� �������� �������� ���
public class B14915_����_��ȯ�� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken()); // �־��� 10����
		int n = Integer.parseInt(st.nextToken()); // ��ȯ�� ����
		char c[] = new char[16]; // 16���� �������� ����� ����
		for (int i = 0; i < 10; i++) { // 0~9
			c[i] = (char) (i + '0');
		}
		for (int i = 0; i < 6; i++) { // 10~16
			c[10 + i] = (char) ('A' + i);
		}
		ArrayList<Character> num = new ArrayList<>(); // �������� ������ ArrayList (���̰� ���� �𸣱� ������ List ���)
		if (m == 0) { // 0�̸� ���� ó��
			sb.append(0);
		}
		while (m > 0) { // ������ ���ϱ�
			num.add(c[m % n]);
			m /= n;
		}
		for (int i = num.size() - 1; i >= 0; i--) { // ���� ���
			sb.append(num.get(i));
		}
		System.out.println(sb); // ���
		br.close();
	}
}
