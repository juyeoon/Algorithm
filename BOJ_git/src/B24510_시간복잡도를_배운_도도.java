import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/24510
// �� �ڵ带 char �迭�� ������ �� �� ���ھ� Ȯ��
// "for", "while" ���� Ƚ���� ����(�迭 �ε��� ����)
// �ִ� ���� Ƚ�� �����Ͽ� �ڵ� �� Ȯ���ϰ� �ִ� ���
public class B24510_�ð����⵵��_���_���� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // �ڵ� ���� ����
		int max = 0; // �ִ� ���� Ƚ��
		for (int i = 0; i < n; i++) { // �ڵ�
			char c[] = br.readLine().toCharArray(); // �ڵ�
			int cnt = 0; // ���� Ƚ��
			int leng = c.length; // �ݺ��� ���� ����
			for (int j = 0; j < leng; j++) {
				if (j < leng - 2 && c[j] == 'f' && c[j + 1] == 'o' && c[j + 2] == 'r') { // "for"
					cnt++;
					j += 2;
				} else if (j < leng - 4 && c[j] == 'w' && c[j + 1] == 'h' && c[j + 2] == 'i' && c[j + 3] == 'l'
						&& c[j + 4] == 'e') { // "while"
					cnt++;
					j += 4;
				}
			}
			max = Math.max(cnt, max); // max ����
		}
		System.out.println(max); // ���
		br.close();
	}
}
