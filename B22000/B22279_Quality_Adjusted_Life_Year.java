import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/22279
// QALY = (���� �� + ���� ��)�� ��
public class B22279_Quality_Adjusted_Life_Year {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // QALY�� ����� �Ⱓ
		double sum = 0; // QALY
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double a = Double.parseDouble(st.nextToken()); // ���� ��
			double b = Double.parseDouble(st.nextToken()); // ���� ��
			sum += a * b; // QALY ����
		}
		System.out.println(sum); // ���
		br.close();
	}
}
