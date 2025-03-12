import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/33166
// Pkm까지 가는데 1km 마다 A엔, 그 이후로는 1km마다 B엔이 들 때, Qkm까지의 금액은 얼마인가 
// Q가 P 이상이면 P동안의 금액 + (Q-P)동안의 금액 = P * A + (Q-P) * B
// Q가 더 작으면 Q 동안의 금액 = Q * A
public class B33166_鉄道旅行_3_Railway_Trip_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int P = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int ans = 0; // 총 금액
		if (P <= Q) {
			ans += P * A;
			ans += (Q - P) * B;
		} else {
			ans += Q * A;
		}
		System.out.println(ans); // 출력
		br.close();
	}
}
