import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// N이 1일 때 "*" 출력
// 그 이외의 경우
// 0행과 1행을 N만큼 반복하여 출력
// 0행과 1행의 (행 번호+열 번호)가 짝수면 "*", 홀수면 " " (0행 0열 부터 1행 N-1열까지)
public class B10996_별_찍기_21 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		if (N == 1) { 
			System.out.println("*");
		} else { // N >= 2
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 2; i++) { // 0행, 1행
				for (int j = 0; j < N; j++) { // 열 번호
					if ((i + j) % 2 == 0) { // (행 번호+열 번호)가 짝수
						sb.append("*");
					} else { // 홀수
						sb.append(" ");
					}
				}
				sb.append("\n"); // 개행
			}
			for (int i = 0; i < N; i++) { // 0행+1행을 N번 반복하여 출력
				System.out.print(sb);
			}
		}
		br.readLine();
	}
}