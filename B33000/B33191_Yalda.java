import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/33191
// ���߿� ���� ���� �־����� ����, ����, �߰��� ������ ��ȣ�� �� �� �� �ִ� �ϳ��� ������ �����ϴ� ����
// �ݺ������� ���߿� ���� ���� ���� �̻��̸� �ش� ����Ḧ ���.
// ��� ���� �ʰ��� Nothing ���
public class B33191_Yalda {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int b = Integer.parseInt(br.readLine()); // ����
		String ans = "Nothing"; // ��¹�
		String fruits[] = { "Watermelon", "Pomegranates", "Nuts" }; // ������ ����� �̸�
		for (int i = 0; i < 3; i++) { // 3�� Ȯ��
			if (b >= Integer.parseInt(br.readLine())) { // �� �� ������
				ans = fruits[i];
				break;
			}
		}
		System.out.println(ans); // ���
		br.close();
	}
}
