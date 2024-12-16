import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/26264
// 's'�� 'b'�� �� �ܾ �� ������ ���� ������ �ش� ������ ���� Ƚ���� ī��Ʈ�ؼ�
// ������ �°� ���Ͽ� ���
public class B26264_������_������ȣ {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String s = br.readLine(); // �Է� ���ڿ�
		int sCnt = 0; // security ����
		int bCnt = 0; // bigdata ����
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 's') { // security
				sCnt++;
			} else if (c == 'b') { // bigdata
				bCnt++;
			}
		}
		if (sCnt > bCnt) { // security�� �� ����
			System.out.println("security!");
		} else if (sCnt < bCnt) { // bigdata�� �� ����
			System.out.println("bigdata?");
		} else { // ������ ����
			System.out.println("bigdata? security!");
		}
		br.close();
	}
}
