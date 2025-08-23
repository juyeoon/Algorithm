import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/26940
// 초콜릿 개수가 늘어나는 순간 새 상자를 구매
public class B26940_Chokladkartongen {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = 0; // 새 상자 최소 구매 횟수
		int prev = Integer.parseInt(st.nextToken()); // 첫 관찰값
		for (int i = 1; i < N; i++) {
			int cur = Integer.parseInt(st.nextToken()); // 지금 관찰값
			if (cur > prev) { // 증가하면
				cnt++; // 구매
			}
			prev = cur;
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}
