import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 수열 B의 앞의 항부터 계산
// 수열 A의 i항 = 수열 B의 i항 * (i+1) - 수열 A의 이전 항의 합
public class B10539_수빈이와_수열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 수열의 항의 수
		String s[] = br.readLine().split(" "); // 수열 B
		int sum = 0; // 수열 A의 이전 항의 합
		for (int i = 0; i < N; i++) {
			int b = Integer.parseInt(s[i]); // 수열 B의 i항
			int ans = b * (i + 1) - sum; // 수열 A의 i항
			sum += ans; // 수열 A의 이전 항의 합 갱신
			sb.append(ans).append(" "); // 수열 A의 항 출력
		}
		System.out.println(sb); // 출력
		br.close();
	}
}