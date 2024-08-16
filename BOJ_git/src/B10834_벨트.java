import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// boolean으로 회전방향 저장(0이면 그대로 1이면 not연산)
// 회전비 = 이전 바퀴 회전비 / a * b
public class B10834_벨트 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int rot[] = new int[M + 1]; // 회전수 비
		rot[0] = 1; // 1번 바퀴 회전수
		boolean direction = true; // 회전 방향(true: 시계방향)
		for (int i = 1; i <= M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()); // i-1번 회전비
			int b = Integer.parseInt(st.nextToken()); // i번 회전비
			int s = Integer.parseInt(st.nextToken()); // 회전 방향
			rot[i] = rot[i - 1] / a * b; // i번 바퀴 회전비 구하기
			direction = s == 0 ? direction : !direction; // 회전 방향 갱신
		}
		System.out.println((direction ? 0 : 1) + " " + rot[M]); // 출력
		br.close();
	}
}
