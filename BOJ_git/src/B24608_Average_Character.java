import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/24608
// ���ڿ��� ��� ������ �ƽ�Ű�ڵ带 ���� �� ���ڿ��� ���̷� ���� ���� �ٽ� ���������� ���
public class B24608_Average_Character {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char c[] = br.readLine().toCharArray(); // �Է� ���ڿ�
		int sum = 0; // �ƽ�Ű�ڵ��� ��
		for (char i : c) { // �� ���ϱ�
			sum += i;
		}
		System.out.println((char) (sum / c.length)); // ��� �ƽ�Ű�ڵ� ���� ���������� ��ȯ �� ���
		br.close();
	}
}
