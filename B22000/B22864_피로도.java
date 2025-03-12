import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 한시간 단위이므로 24번 계산
// 일을 했을 때 피로도가 M이 안 넘을 때 일을 할 수 있음 
// 일을 할 때 => 지금까지의 일의 양 + B, 현재 피로도 + A
// 쉴 때 => 현재 피로도 - C (C가 음수가 되면 0으로 변경)
public class B22864_피로도 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken()); // 일했을 때 쌓이는 피로도
		int B = Integer.parseInt(st.nextToken()); // 일했을 때 처리하는 일
		int C = Integer.parseInt(st.nextToken()); // 쉬었을 때 해소되는 피로도
		int M = Integer.parseInt(st.nextToken()); // 피로도 최대치
		int ans = 0; // 최대한 할 수 있는 일의 양
		int tired = 0; // 현재의 피로도
		for (int i = 0; i < 24; i++) { // 24시간동안 계산
			if (tired + A <= M) { // 일을 했을 때 피로도가 M이 안 넘을 때 일을 할 수 있음
				ans += B; // 일의 양 갱신
				tired += A; // 현재 피로도 갱신
			} else { // 쉬어야 할 때
				tired -= C; // 피로도 갱신
				tired = Math.max(0, tired); // 피로도가 음수가 되지 않게
			}
		}
		System.out.println(ans); // 출력
		br.close();
	}
}
