import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/25630
// �Ӹ������ �Ƿ��� �տ��� ù��°, �ڿ��� ù��° ���ڰ� ���ƾ� �ϰ� �տ��� �ι�°, �ڿ��� �ι�° ���ڰ� ���� ������
// ����Ǿ�� �ϹǷ� �� ��ġ�� ���ڰ� ���� ���� ������ ���
public class B25630_�Ӹ����_�Ҷ��Ҷ� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		char c[] = br.readLine().toCharArray(); // �Ҷ��Ҷ� �迭
		int front = 0; // �� �ε���
		int back = N - 1; // �� �ε���
		int cnt = 0; // �ٲ�� �ϴ� ����
		while (front < back) { //
			if (c[front] != c[back]) { // ��ġ�� ���ڵ��� ���� ������ ī��Ʈ
				cnt++;
			}
			front++;
			back--;
		}
		System.out.println(cnt); // ���
		br.close();
	}
}
