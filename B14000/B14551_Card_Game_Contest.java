import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/14551
// 각 대회마다의 가능한 카드 수를 모두 곱하면 됨 (조합)
// 입력이 0인 경우 1로 변경하여 계산
// 대회의 카드 덱 수를 곱할 때마다 M으로 나눈 나머지로 갱신 (모두 곱하고 나머지를 구하는 거랑 곱할 때마다 나머지를 구해 곱하는 거랑 같음)
// 마지막에 입력이 "0 1"인 경우를 위해 출력 시 한 번 더 M으로 나눈 나머지 출력
public class B14551_Card_Game_Contest {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int ans = 1;
		for (int i = 0; i < N; i++) {
			int A = Integer.parseInt(br.readLine());
			if (A < 1) {
				A = 1;
			}
			ans *= A;
			ans %= M;
		}
		System.out.println(ans % M);
		br.close();
	}
}
