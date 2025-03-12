import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/33163
// J -> O, O -> I, I -> J�� ��ȯ�Ͽ� ���
public class B33163_OIJ_OIJ {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // ���ڿ� ����
		String s = br.readLine(); // ���ڿ�
		for (int i = 0; i < N; i++) { // ��ȯ
			char c = s.charAt(i);
			if (c == 'J') {
				sb.append("O");
			} else if (c == 'O') {
				sb.append("I");
			} else {
				sb.append("J");
			}
		}
		System.out.println(sb); // ���
		br.close();
	}
}
