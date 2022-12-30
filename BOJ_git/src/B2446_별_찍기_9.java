import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 이중 for문을 이용하여 별 찍기
// 위쪽 + 가운데 / 아래쪽으로 나누어서 반복문 사용
// 위쪽 + 가운데  => (행 번호 - 1)만큼 공백을 찍은 후, (N - 행 번호 - 2) * 2만큼 별 찍고 다음 행으로
// 가운데 => (두 번째 행부터 시작) (N - 행 번호)만큼 공백을 찍은 후, (행 번호 * 2 - 1)만큼 별 찍고 다음 행으로
public class B2446_별_찍기_9 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 행 개수 = 2 * N - 1
		for (int i = 0; i < N; i++) { // 위쪽 + 가운데
			for (int j = 0; j < i; j++) { // (행 번호 - 1)만큼 공백 찍기
				sb.append(" ");
			}
			for (int j = 0; j <= 2 * (N - i - 1); j++) { // (N - 행 번호 - 2) * 2만큼 별 찍기
				sb.append("*");
			}
			sb.append("\n");
		}
		for (int i = 2; i <= N; i++) { // 아래쪽
			for (int j = 0; j < N - i; j++) {  // (N - 행 번호)만큼 공백 찍기
				sb.append(" ");
			}
			for (int j = 0; j < i * 2 - 1; j++) {  // (행 번호 * 2 - 1)만큼 별 찍기
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}