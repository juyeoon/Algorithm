import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 이중 for문을 이용하여 별 찍기
// 행 번호가 홀수면 "* "을 N만큼 반복, 짝수면 " *"을 N만큼 반복
public class B10995_별_찍기_20 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 행 개수
		boolean odd = true; // 행 번호가 홀수면 true, 짝수면 false
		for (int i = 0; i < N; i++) {
			if (odd) { // 행 번호가 홀수일 때
				for (int j = 0; j < N; j++) { // "* "을 N만큼 반복
					sb.append("* ");
				}
			} else { // 행 번호가 짝수일 때
				for (int j = 0; j < N; j++) { // " *"을 N만큼 반복
					sb.append(" *");
				}
			}
			sb.append("\n"); // 다음 행으로
			odd = !odd; // 홀짝 바꾸기
		}
		System.out.println(sb); // 출력
		br.close();
	}
}