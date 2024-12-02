import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/20735
// �־��� ���ڿ��� ��ҹ��� ���� ���� "pink"�� "rose"�� ���Ե� ���ڿ��� ������ ã�� ����
// ��ҹ��� ������ �����Ƿ� �Է� ���ڿ��� ��� �ҹ��ڷ� ������ ��
// String.indexOf("ã�� ���ڿ�")�� -1�� �ƴϸ� ���ڿ��� ����
public class B20735_Fifty_Shades_of_Pink {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // Ȯ���� ���ڿ��� ��
		int cnt = 0; // "pink" �Ǵ� "rose"�� ���Ե� ���ڿ��� ��
		for (int i = 0; i < N; i++) {
			String s = br.readLine().toLowerCase(); // �Է� ���ڿ��� �ҹ��ڷ� ����
			if (s.indexOf("pink") != -1 || s.indexOf("rose") != -1) { // "pink"�� "rose"�� �ϳ��� ���ԵǾ� ������
				cnt++; // ī��Ʈ
			}
		}
		System.out.println(cnt == 0 ? "I must watch Star Wars with my daughter" : cnt); // ���ǿ� �°� ���
		br.close();
	}
}
