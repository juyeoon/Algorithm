import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/32722
// �������� ��ȣ�� �ְ� ��ȣ�� �־����� �� �־��� ��ȣ�� �������� ���� �� ���� �� �ִ� ��ȣ���� ����ϴ� ����
// ������ �迭�� ������ ��ȣ�� ������ �� �� �����濡 �ش��ϴ� ��ȣ���� Ȯ���ϰ� �ϳ��� �ƴϸ� EI ���
public class B32722_Juta_teekond {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num[][] = { { 1, 6, 2 }, { 3, 8, 5 } }; // ������ ��ȣ
		boolean yes = true; // �������� �� ���� �� ������ true
		for (int i = 0; i < 3; i++) { // 3���� ������
			int n = Integer.parseInt(br.readLine());
			if (n != num[0][i] && n != num[1][i]) { // �� ���� ��ȣ ��� �ƴϸ�
				yes = false; // �������� �� ���� �ƴ�
				break;
			}
		}
		System.out.println(yes ? "JAH" : "EI"); // ���
		br.close();
	}
}
