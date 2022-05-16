import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 다음 위치 => 현재 위치+주사위 값+(위치+값)의 말판 값
public class B5566_주사위_게임 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] map = new int[N + 1]; // 보드 지시사항 값(1~N)
		for (int i = 1; i <= N; i++) { // input map
			map[i] = Integer.parseInt(br.readLine());
		}
		int loc = 1; // 현재 위치
		int cnt = 0; // 주사위 굴린 횟수
		while (loc < N) { // 현재 위치가 N을 넘어가지 않을때만 반복
			++cnt; // 굴린 횟수 ++
			int value = Integer.parseInt(br.readLine()); // 주사위 값
			if (loc + value > N) { // 현재 위치 + 주사위 값이 N을 넘어가면 반복문 멈춤
				break;
			}
			loc += map[loc + value] + value; // 다음 위치 = 현재 위치 + 주사위 값 + (현재 위치 + 주사위 값)의 지시사항 값
		}
		System.out.println(cnt); // 주사위 굴린 횟수 출력
		br.close();
	}
}
