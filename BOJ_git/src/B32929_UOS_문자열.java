import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/32929
// UOS�� ������ 3���� ���� �������� 0�̸� S, 1�̸� U, 2�̸� O ���
public class B32929_UOS_���ڿ� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // �Է� ��
		String s[] = { "S", "U", "O" }; // ������ ���� �ش��ϴ� ����
		System.out.println(s[N % 3]); // 3���� ���� ������ ���� �ش��ϴ� ���� ���
		br.close();
	}
}
