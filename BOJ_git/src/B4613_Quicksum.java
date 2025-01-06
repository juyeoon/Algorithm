import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/4613
// �ƽ�Ű�ڵ带 ����ؼ� ���ڸ� ���ڷ� ��ȯ �� quicksum ���ϱ�
public class B4613_Quicksum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("#")) { // EOI
			int quickSum = 0; // quicksum
			int leng = s.length();
			for (int i = 0; i < leng; i++) { // quicksum ���ϱ�
				if (s.charAt(i) != ' ') { // ���� ����
					quickSum += (s.charAt(i) - 'A' + 1) * (i + 1);
				}
			}
			sb.append(quickSum).append("\n");
		}
		System.out.println(sb); // ���
		br.close();
	}
}
