import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/33178
// ��õ�� �л��� ���� 10% ��ŭ ����� ���Ǹ� ������ �� ����
// ����� ������ �� �ִ� ���� �� = ��õ�� �л� �� / 10 (��)
public class B33178_Micromasters {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // ��õ�� �л��� ��
		System.out.println(N / 10);
		br.close();
	}
}
