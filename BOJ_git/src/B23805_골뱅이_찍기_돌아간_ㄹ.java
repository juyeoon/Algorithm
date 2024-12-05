import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/23805
// ������ �м��� �� �ݺ����� ����ؼ� ���
// ù��° �� : ('@'N*3�� ' 'N�� '@'N�� )N��
// ��� �� : ('@'N�� ' 'N�� '@'N�� ' 'N�� '@'N�� )N*3��
// ������ �� : ('@'N�� ' 'N�� '@'N*3�� )N��
public class B23805_�����_���_���ư�_�� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // ���� ũ��
		StringBuilder sbtmp = new StringBuilder(); // �ӽ� StringBuilder
		String first = ""; // ù��° �� ���
		String mid = ""; // �߰� �� ���
		String last = ""; // ������ �� ���
		// ù��° �� �����
		for (int j = 0; j < N * 3; j++) {
			sbtmp.append("@");
		}
		for (int j = 0; j < N; j++) {
			sbtmp.append(" ");
		}
		for (int j = 0; j < N; j++) {
			sbtmp.append("@");
		}
		first = sbtmp.toString();
		// �߰� �� �����
		sbtmp.setLength(0);
		for (int j = 0; j < N; j++) {
			sbtmp.append("@");
		}
		for (int j = 0; j < N; j++) {
			sbtmp.append(" ");
		}
		for (int j = 0; j < N; j++) {
			sbtmp.append("@");
		}
		for (int j = 0; j < N; j++) {
			sbtmp.append(" ");
		}
		for (int j = 0; j < N; j++) {
			sbtmp.append("@");
		}
		mid = sbtmp.toString();
		// ������ �� �����
		sbtmp.setLength(0);
		for (int j = 0; j < N; j++) {
			sbtmp.append("@");
		}
		for (int j = 0; j < N; j++) {
			sbtmp.append(" ");
		}
		for (int j = 0; j < N * 3; j++) {
			sbtmp.append("@");
		}
		last = sbtmp.toString();
		// ���� ��� �����
		for (int i = 0; i < N; i++) {
			sb.append(first).append("\n");
		}
		for (int i = 0; i < N * 3; i++) {
			sb.append(mid).append("\n");
		}
		for (int i = 0; i < N; i++) {
			sb.append(last).append("\n");
		}
		System.out.println(sb); // ���
		br.close();
	}
}
