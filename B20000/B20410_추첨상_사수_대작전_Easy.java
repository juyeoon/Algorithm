import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/20410
// X1 = (a * Seed + c) % m
// X2 = (a * X1 + c) % m
// 를 만족하는 (a, c) 조합 중 하나를 찾는 문제
// m은 100 이하의 소수이므로 브루트포스(완전탐색)로 충분히 빠르게 해결 가능
public class B20410_추첨상_사수_대작전_Easy {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken()); // 소수 m
		int seed = Integer.parseInt(st.nextToken()); // 참가자들이 정한 Seed
		int x1 = Integer.parseInt(st.nextToken()); // 시연으로 공개된 X1
		int x2 = Integer.parseInt(st.nextToken()); // 시연으로 공개된 X2
		int a = 0; // 가능한 정수 a
		int c = 0; // 가능한 정수 c
		// 브루트포스로 a와 c를 모두 탐색
		outer: for (a = 0; a < m; a++) {
			for (c = 0; c < m; c++) {
				int testX1 = (a * seed + c) % m; // X1을 예측
				int testX2 = (a * testX1 + c) % m; // X2를 예측
				if (testX1 == x1 && testX2 == x2) { // // 예측값이 실제 공개된 값과 일치하면 찾은 것
					break outer;
				}
			}
		}
		System.out.println(a + " " + c); // 출력
		br.close();
	}
}
