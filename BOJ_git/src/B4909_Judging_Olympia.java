import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/4909
// 6���� ���� �߿� ����, �ְ����� �� ��� ���� ���ϴ� ����
// 6�� ���� ���� �� ����, �ְ��� ����
// ��¿��� �Ҽ��� �� ���ڰ� ������ �Ҽ��� ���� ���
public class B4909_Judging_Olympia {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("0 0 0 0 0 0")) { // EOI
			StringTokenizer st = new StringTokenizer(s);
			int num[] = new int[6]; // ���� ���
			for (int i = 0; i < 6; i++) { // num[] ä���
				num[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(num); // ����
			double ans = num[1] + num[2] + num[3] + num[4]; // ����, �ְ����� �� ��
			ans /= 4; // ��� ���ϱ�
			if (ans % 1 != 0) { // ��� ���� ���߱�
				sb.append(ans);
			} else {
				sb.append((int) ans);
			}
			sb.append("\n");
		}
		System.out.println(sb); // ���
		br.close();
	}
}
