import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 주어진 식의 규칙 찾기 
// 1부터 n+1까지의 합 = (n + 1) * (n + 2) / 2
// W(n) = Sum[k=1..n; k * (k + 1) * (k + 2) / 2]
public class B2721_삼각수의_합 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			int n = Integer.parseInt(br.readLine()); // W(n)의 n
			int ans = 0; // W(n)
			for (int i = 1; i <= n; i++) { // W(n) 구하기
				ans += i * (i + 1) * (i + 2) / 2;
			}
			sb.append(ans).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
