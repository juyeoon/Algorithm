import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// k번째 정류장에서 남은 승객 수는 (N - (2^k - 1))/2^k = 0
// 따라서 N = 2^k - 1
public class B9546_3000번_버스 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			int k = Integer.parseInt(br.readLine());
			sb.append((int) Math.pow(2, k) - 1).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}