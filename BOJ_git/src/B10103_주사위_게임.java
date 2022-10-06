import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 두 수를 비교 후 작은 쪽에 상대방 수 빼기를 반복
public class B10103_주사위_게임 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int n = Integer.parseInt(br.readLine()); // 라운드의 수
		int chang = 100; // 창영 초기값
		int sang = 100; // 상덕 초기값
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()); // 창영의 주사위 수
			int b = Integer.parseInt(st.nextToken()); // 상덕의 주사위 수
			if (a > b) { // 상덕이 졌을 때
				sang -= a; // 상덕의 값에서 창영의 주사위 수를 뺌
			} else if (a < b) { // 창영이 졌을 때
				chang -= b; // 창영의 값에서 상덕의 주사위 수를 뺌
			}
		}
		System.out.println(chang + "\n" + sang); // 창영 값, 상덕 값 출력
		br.close();
	}
}