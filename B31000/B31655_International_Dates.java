import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/31655
// �����̳� �̱��� ��¥ ������ �־����� �� ��� �������� �Ǻ��ϴ� ����
// '/'�� �������� ���ڿ��� ���� �� �� ���� ��(a)�� ��� ��(b)�� ����
// a�� 12�� ������ a�� �� => EU
// b�� 12�� ������ b�� �� => US
// a�� b ��� 12 ���ϸ� => either
public class B31655_International_Dates {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "/"); // '/'�� �������� ������
		int a = Integer.parseInt(st.nextToken()); // �� ���� ��
		int b = Integer.parseInt(st.nextToken()); // ��� ��
		if (a > 12) {
			System.out.println("EU");
		} else if (b > 12) {
			System.out.println("US");
		} else {
			System.out.println("either");
		}
		br.close();
	}
}
