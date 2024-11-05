import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// �Է� ���ڿ��� �������� �и��ϰ� ù��° �ܾ ������ �ܾ���� üũ
// ù ��° �ܾ�� � �ܾ�� ������� ù ���� ��� ����
// �� ��° �ܾ���� ������ �������� Ȯ�� �� ������ ������ �ƴϸ� ù ���� ��� ����
// ��� ����� ���ڿ��� ��� �빮�ڷ� �ٲ� �� ���
public class B3181_���Ӹ�_����� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine()); // ù ��° �ܾ�
		sb.append(st.nextToken().charAt(0)); // ù �ܾ��� ù ��° ���� �߰�
		while (st.countTokens() > 0) { // ��� �ܾ� Ȯ��
			String s = st.nextToken();
			boolean add = false; // �߰��� �ܾ����� Ȯ��(false: �߰� ����)
			switch (s) {
			// ������ ���ڸ� �״�� break
			case "i":
				break;
			case "pa":
				break;
			case "te":
				break;
			case "ni":
				break;
			case "niti":
				break;
			case "a":
				break;
			case "ali":
				break;
			case "nego":
				break;
			case "no":
				break;
			case "ili":
				break;
			// ���� �߰��� ���ڸ� flag üũ
			default:
				add = true;
				break;
			}
			if (add) { // �߰��� �ܾ��
				sb.append(s.charAt(0)); // �ܾ��� ù��° ���� �߰�
			}
		}
		System.out.println(sb.toString().toUpperCase()); // ��¹��� ��� �빮�ڷ� �ٲ㼭 ���
		br.close();
	}
}
