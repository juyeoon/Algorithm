import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/11195
// �־��� ���ڿ��� ���� ������ �ٲپ� �Ӹ�������� �ٲ� �� �����ؾ��ϴ� �ּ����� ������ ������ ���ϴ� ����
// ���ڿ��� �̷�� ������ ������ ������ ���� �� Ȧ�� ���� ������ ������ ������ ����
// ������ 0�̸� 0 ���, 0���� ũ�� Ȧ�� ���� ������ ���� �� �ϳ��� ��� ��ġ�ϸ� �ǹǷ� ���� - 1 ���
public class B11195_Peragrams {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // ���ڿ�
		int alphabetCnt[] = new int[26]; // ���� ������ ����
		for (int i = s.length() - 1; i >= 0; i--) { // alphabetCnt[] ���ϱ�
			alphabetCnt[s.charAt(i) - 'a']++;
		}
		int ans = 0; // Ȧ�� ���� ������ ���� ����
		for (int i : alphabetCnt) { // ans ���ϱ�
			if (i % 2 == 1) {
				ans++;
			}
		}
		System.out.println(ans == 0 ? ans : ans - 1); // ���
		br.close();
	}
}
