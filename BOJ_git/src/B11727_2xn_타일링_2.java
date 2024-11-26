import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/11727
// n��° ������ n-1��°�� ������ (n-2��°�� ����)*2�� �� (���� �׷����� �� �� ����)
// dp�� n��°������ ������ ����ؼ� ã��
public class B11727_2xn_Ÿ�ϸ�_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int dp[] = new int[n + 2]; // �Է��� 1ĭ �϶� dp[2]���� �� �ɸ��� ���� +1�� �ƴϰ� +2
		dp[1] = 1; // 2x1ĭ
		dp[2] = 3; // 2x2ĭ
		for (int i = 3; i <= n; i++) { // dp ���ϱ�
			dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10007; // �������� ���� ���� �������� ����
		}
		System.out.println(dp[n]); // ���
		br.close();
	}
}
