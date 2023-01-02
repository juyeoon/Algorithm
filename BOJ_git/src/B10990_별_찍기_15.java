import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 이중 for문을 이용하여 별 찍기
// (N - 행 번호)만큼 공백 찍은 후, 별 하나 찍은 후, (2 * 행 번호 - 3)만큼 공백 찍고, 행 번호가 1이 아니면 별 하나 찍고 다음 행으로
public class B10990_별_찍기_15 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 행 개수
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < N - i; j++) { // (N - 행 번호)만큼 공백 찍기
				sb.append(" ");
			}
			sb.append("*"); // 별 하나 찍기
			for (int j = 0; j < 2 * i - 3; j++) { // (2 * 행 번호 - 3)만큼 공백 찍기
				sb.append(" ");
			}
			if (i != 1) { // 행 번호가 1이 아니면 별 하나 찍기
				sb.append("*");
			}
			sb.append("\n"); // 다음 행으로
		}
		System.out.println(sb); // 출력
		br.close();
	}
}