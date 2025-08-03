import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/10406
// 공정한 펀치 조건 => 허리 높이 <= 펀치 높이 <= 목 높이
public class B10406_The_fellowship_of_the_ring {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int W = Integer.parseInt(st.nextToken()); // 상대의 허리 높이
		int N = Integer.parseInt(st.nextToken()); // 상대의 목 높이
		int P = Integer.parseInt(st.nextToken()); // 펀치의 개수
		st = new StringTokenizer(br.readLine());
		int cnt = 0;
		for (int i = 0; i < P; i++) {
			int h = Integer.parseInt(st.nextToken()); // 펀치의 높이
			if (h >= W && h <= N) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
