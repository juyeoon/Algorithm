import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// ���� ���ڸ� %���ڷ� ���ڵ��Ͽ� ����ϴ� ����
// ���� ���ڸ� key, %���ڸ� value�� �ϴ� hashmap�� �����ϰ�
// �־��� ���ڿ��� ���ڸ� �ϳ��� Ȯ���ϸ鼭 ��ü�ϱ� 
public class B4606_The_Seven_Percent_Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Map<Character, String> map = new HashMap<>(); // ���ڵ� ���� map
		map.put(' ', "%20");
		map.put('!', "%21");
		map.put('$', "%24");
		map.put('%', "%25");
		map.put('(', "%28");
		map.put(')', "%29");
		map.put('*', "%2a");
		String s = "";
		while (!(s = br.readLine()).equals("#")) { // EOI
			char c[] = s.toCharArray(); // �Է� ���ڿ�
			for (int i = 0; i < c.length; i++) { // ���� �ϳ��� Ȯ��
				if (map.get(c[i]) == null) { // �ش� ����
					sb.append(c[i]);
				} else { // �ش� ����
					sb.append(map.get(c[i]));
				}
			}
			sb.append("\n");
		}
		System.out.println(sb); // ���
		br.close();
	}
}
