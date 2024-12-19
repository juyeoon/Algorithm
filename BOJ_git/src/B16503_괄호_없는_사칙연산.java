import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/16503
// �ǿ����� 2��, ������ 1���� �����ϴ� �Լ��� ���� ���� ��ȣ ������ �°� ȣ���Ͽ� ��� ����
public class B16503_��ȣ_����_��Ģ���� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int K1 = Integer.parseInt(st.nextToken()); // �ǿ����� 1
		char O1 = st.nextToken().charAt(0); // ������ 1
		int K2 = Integer.parseInt(st.nextToken()); // �ǿ����� 2
		char O2 = st.nextToken().charAt(0); // ������ 2
		int K3 = Integer.parseInt(st.nextToken()); // �ǿ����� 3
		int ans1 = calc(calc(K1, O1, K2), O2, K3); // (K1 O1 K2) O2 K3
		int ans2 = calc(K1, O1, calc(K2, O2, K3)); // K1 O1 (K2 O2 K3)
		sb.append(Math.min(ans1, ans2)).append("\n").append(Math.max(ans1, ans2)); // �ּ� �ִ� ���
		System.out.println(sb);
		br.close();
	}

	public static int calc(int a, char c, int b) { // ���
		int ret = 0; // ���� ���
		if (c == '+') { // +
			ret = a + b;
		} else if (c == '-') { // -
			ret = a - b;
		} else if (c == '*') { // *
			ret = a * b;
		} else if (c == '/') { // /
			ret = a / b;
		}
		return ret;
	}
}
