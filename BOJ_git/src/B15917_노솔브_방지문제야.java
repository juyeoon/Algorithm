import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 주어진 수가 2의 제곱인지 확인하는 문제
// N & (-N)이 N과 같으면 2의 제곱, 아니면 2의 제곱이 아님
public class B15917_노솔브_방지문제야 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int Q = Integer.parseInt(br.readLine()); // 쿼리 개수
		for (int i = 0; i < Q; i++) {
			int a = Integer.parseInt(br.readLine()); // 주어진 수
			sb.append(((a & (-1 * a)) == a) ? 1 : 0).append("\n"); // 2의 제곱이면 1 아니면 0 출력
		}
		System.out.println(sb); // 출력
		br.close();
	}
}