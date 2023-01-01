import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 이중 for문을 이용하여 별 찍기
// 위쪽 / 가운데 + 아래쪽으로 나누어서 반복문 사용
// 위쪽 => (위쪽 행 번호)만큼 별 찍고 다음 행으로
// 가운데 + 아래쪽 => (N - 아래쪽 행 번호 - 1)만큼 별 찍고 다음 행으로
public class B2523_별_찍기_13 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 행 개수 = 2 * N - 1
		for (int i = 1; i < N; i++) { // 위쪽
			for (int j = 0; j < i; j++) { // (위쪽 행 번호)만큼 별 찍기
				sb.append("*");
			}
			sb.append("\n");
		}
		for (int i = 0; i < N; i++) { // 가운데 + 아래쪽
			for (int j = 0; j < N - i; j++) { // (N - 아래쪽 행 번호 - 1)만큼 별 찍기
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}