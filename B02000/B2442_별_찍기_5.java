import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 이중 for문을 이용하여 별 찍기
// (N - 행 번호)만큼 공백을 찍은 후, (행 번호 * 2 - 1)만큼 별 찍고 다음 행으로
public class B2442_별_찍기_5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 행 개수
		for (int i = 1; i <= N; i++) { // 행 반복
			for (int j = 0; j < N - i; j++) { // (N - 행 번호)만큼 공백 찍기
				sb.append(" ");
			}
			for (int j = 0; j < i * 2 - 1; j++) { // (행 번호 * 2 - 1)만큼 별 찍기
				sb.append("*");
			}
			sb.append("\n"); // 개행
		}
		System.out.println(sb);
		br.close();
	}
}