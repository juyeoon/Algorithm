import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/16239
// ���� K�� �־����� �� N���� ��� �ٸ� �ݾ����� ���� �� �� �ϳ��� ����ϴ� ����
// �� �ݾ��� �ּڰ��� �ְ� �ִ��� ���� ������ N-1���� 1���� �ϳ��� �ø� ������ ���ϰ� ������ N��° ���� ���� ���� �� ������ �����Ͽ� ���
public class B16239_Nadan {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int K = Integer.parseInt(br.readLine()); // ���� K
		int N = Integer.parseInt(br.readLine()); // ���� ���� N
		for (int i = 1; i < N; i++) { // N-1���� 1���� 1�� ������ ������ ����
			sb.append(i).append("\n");
			K -= i;
		}
		sb.append(K); // N��° ���� ���� ������ �� ������ ����
		System.out.println(sb); // ���
		br.close();
	}
}
