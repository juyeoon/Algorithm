import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/3234
// 입력받은 문자에 따라 문제 출제자들의 좌표를 이동하고 루카 좌표의 8방 이내에 포함되면 번호 추가
// 처음 문제 출제자들의 좌표(0,0)일 때도 확인하여 번호 0을 출력에 포함하여야 함
public class B3234_LUKA {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int X = Integer.parseInt(st.nextToken()); // 루카가 있는 위치 X 좌표
		int Y = Integer.parseInt(st.nextToken()); // 루카가 있는 위치 Y 좌표
		int K = Integer.parseInt(br.readLine()); // 문제 출제자들의 이동 횟수
		char[] move = br.readLine().toCharArray(); // 문제 출제자들의 이동 경로
		int nowX = 0; // 문제 출제자들의 위치 X 좌표
		int nowY = 0; // 문제 출제자들의 위치 Y 좌표
		// 초기 위치의 문제 출제자들이 루카 주변(8방)에 있을 때
		if ((X - 1 <= nowX && nowX <= X + 1) && (Y - 1 <= nowY && nowY <= Y + 1)) {
			sb.append(0).append("\n");
		}
		// 문제 출제자들 이동
		for (int i = 0; i < K; i++) {
			char nowMove = move[i]; // 이동 방향
			switch (nowMove) { // 현재 위치 이동
			case 'I':
				nowX++;
				break;
			case 'S':
				nowY++;
				break;
			case 'Z':
				nowX--;
				break;
			case 'J':
				nowY--;
				break;
			}
			// 이동한 위치가 루카 주변(8방)에 있을 때
			if ((X - 1 <= nowX && nowX <= X + 1) && (Y - 1 <= nowY && nowY <= Y + 1)) {
				sb.append(i + 1).append("\n");
			}
		}
		if (sb.length() == 0) { // 한 번도 루카 주변에 있지 않았을 때
			sb.append(-1);
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
