import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 이중 for문을 이용하여 별 찍기
// (N - 행 번호(0부터) - 1)만큼 공백 찍은 후, (행 번호 + 1)만큼 "* " 찍고 다음 행으로
public class B10991_별_찍기_16 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 행 개수
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N - i - 1; j++) { // (N - 행 번호(0부터) - 1)만큼 공백 찍기
				sb.append(" ");
			}
			for (int j = 0; j <= i; j++) { // (행 번호 + 1)만큼 "* " 찍기
				sb.append("* ");
			}
			sb.append("\n"); // 다음 행으로
		}
		System.out.println(sb); // 출력
		br.close();
	}
}