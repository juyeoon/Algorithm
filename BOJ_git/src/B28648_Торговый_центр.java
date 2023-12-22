import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 입력 라인의 두 값의 합 중 최솟값 출력
public class B28648_Торговый_центр {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int n = Integer.parseInt(br.readLine()); // 입력 라인 수
		int ans = Integer.MAX_VALUE; // 출력값 (입력 라인의 두 값의 합 중 최솟값)
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			ans = Math.min(ans, Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())); // 최솟값 갱신
		}
		System.out.println(ans); // 출력
		br.close();
	}
}