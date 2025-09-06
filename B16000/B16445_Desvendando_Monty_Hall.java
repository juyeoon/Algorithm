import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/16445
// 플레이어가 이길 수 있는 경우 => 차가 1번 문에 없는 경우
// 승리 횟수 => 차가 1번 문이 아닌 횟수
public class B16445_Desvendando_Monty_Hall {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 시뮬레이션할 게임 수
		int win = 0; // 플레이어가 차를 얻은 횟수
		for (int i = 0; i < N; i++) {
			int car = Integer.parseInt(br.readLine()); // 이 게임에서 차가 있는 문 번호
			if (car != 1)
				win++; // 스위치 전략의 승리 조건
		}
		System.out.println(win); // 출력
		br.close();
	}
}
