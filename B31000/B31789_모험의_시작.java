import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/31789
// 모험을 떠날 수 있는 조건 = 가진 돈 >= 무기 가격 && 문지기의 공격력 < 무기 공격력
public class B31789_모험의_시작 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int X = Integer.parseInt(st.nextToken()); // 가진 돈
		int S = Integer.parseInt(st.nextToken()); // 문지기의 공격력
		boolean yes = false; // 모험을 떠날 수 있는지 여부 
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(st.nextToken()); // 무기의 가격
			int p = Integer.parseInt(st.nextToken()); // 무기의 공격력
			if (X >= c && S < p) { // 무기를 구매 가능 && 문지기 처리 가능
				yes = true;
				break;
			}
		}
		System.out.println(yes ? "YES" : "NO"); // 출력
		br.close();
	}
}
