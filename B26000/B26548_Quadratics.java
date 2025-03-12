import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/26548
// ������������ ����� ���� �־����� ���� ������ Ȱ���Ͽ� �� ���� ���ϴ� ����
public class B26548_Quadratics {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine().trim()); // �׽�Ʈ���̽�
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			double a = Double.parseDouble(st.nextToken()); // a
			double b = Double.parseDouble(st.nextToken()); // b
			double c = Double.parseDouble(st.nextToken()); // c
			double val1 = ((-1 * b) + Math.sqrt(b * b - 4 * a * c)) / (2 * a); // �� (ū ��)
			double val2 = ((-1 * b) - Math.sqrt(b * b - 4 * a * c)) / (2 * a); // �� (���� ��)
			sb.append(String.format("%.3f, %.3f\n", val1, val2)); // ��� ����
		}
		System.out.println(sb); // ���
		br.close();
	}
}
