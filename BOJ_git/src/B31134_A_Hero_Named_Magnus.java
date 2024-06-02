import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// n전 (n+1)/2선승 게임을 하고 x번째 게임부터 무조건 승리한다고 할 때 최악의 경우 승리를 확정할 수 있는 최소 n의 값을 구하는 문제
// 1부터 (x-1)는 지고 x부터 (1부터 (x-1))+1만큼 이기면
// n = x * 2 - 1
public class B31134_A_Hero_Named_Magnus {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			long x = Long.parseLong(br.readLine());
			sb.append(x * 2 - 1).append("\n"); // n
		}
		System.out.println(sb); // 출력
		br.close();
	}
}