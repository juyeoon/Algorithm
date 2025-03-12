import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/16675
// 네 손을 순서대로 기준 손으로 정하고 반대편의 사람의 왼손, 오른손 2번을 비교해서 둘 다 이길 수 있으면 무조건 승리함
public class B16675_두_개의_손 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		char mt[][] = { { st.nextToken().charAt(0), st.nextToken().charAt(0) },
				{ st.nextToken().charAt(0), st.nextToken().charAt(0) } }; // 가위바위보 상태
		int winner = 2; // 무조건 이기는 사람 (0: 민성, 1: 태경, 2: 없음)
		Loop: for (int i = 0; i < 2; i++) { // 민성 -> 태경
			for (int j = 0; j < 2; j++) { // 왼손 -> 오른손
				char now = mt[i][j]; // 기준 손
				int idx = 1 - i; // 기준 손을 낸 사람의 반대 사람
				boolean win = true; // 무조건 이기면 true
				for (int k = 0; k < 2; k++) { // 기준 손 반대 사람의 왼손 -> 오른손
					// 지거나 비기면 이길 수 없음
					if (now == 'R') {
						if (mt[idx][k] == 'P' || mt[idx][k] == 'R') {
							win = false;
							break;
						}
					} else if (now == 'S') {
						if (mt[idx][k] == 'R' || mt[idx][k] == 'S') {
							win = false;
							break;
						}
					} else {
						if (mt[idx][k] == 'S' || mt[idx][k] == 'P') {
							win = false;
							break;
						}
					}
				}
				if (win) { // 반대 사람의 모든 손을 이길 수 있으면
					winner = i; // 우승자는 기준 손을 낸 사람
					break Loop;
				}
			}
		}
		if (winner == 0) { // 민성
			System.out.println("MS");
		} else if (winner == 1) { // 태경
			System.out.println("TK");
		} else { // 무조건 이길 수 없음
			System.out.println("?");
		}
		br.close();
	}
}