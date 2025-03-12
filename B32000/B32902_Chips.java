import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/32902
// k���� ĵ�� n���� Ĩ�� �ְ� 1�и��� Ĩ�� ���� �� �� ��� �ڿ� ���� ĵ�� �������� (�ִ� �ּ�)
// 1�и��� k���� ĵ�� �ִ� Ĩ�� �ϳ��� ������ �� n+1�� �ڿ��� �� ����(�ּ�)
// 1�и��� 1���� ĵ�� ��� Ĩ�� �ϳ��� ������ �� n*k+1�� �ڿ� �� ����(�ִ�)
public class B32902_Chips {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken()); // ĵ ����
		int n = Integer.parseInt(st.nextToken()); // Ĩ ����
		System.out.println((n + 1) + " " + (n * k + 1)); // �ּ� �ִ� ���
		br.close();
	}
}
