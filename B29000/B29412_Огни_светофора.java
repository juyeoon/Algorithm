import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/29412
// 신호등의 전체 주기(cycleTime)를 구한 후 한 주기 안에서 각 색이 켜저 있는 시간을 계산.
// 하루 시간 동안 주기의 횟수를 구하고 주기 진행 후 남은 시간(remainder) 동안의 신호등 불을 계산 함.
// 각 색상의 불이 켜진 시간 = 주기 횟수 * 한 주기 동안의 불이 켜진 시간 + 나머지 시간동안 불이 켜진 시간
public class B29412_Огни_светофора {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int g = Integer.parseInt(st.nextToken()); // 초록 불 시간
		int gb = Integer.parseInt(st.nextToken()); // 깜빡이는 초록 불 시간
		int y = Integer.parseInt(st.nextToken()); // 노랑 불 시간
		int r = Integer.parseInt(st.nextToken()); // 빨강 불 시간
		int ry = Integer.parseInt(st.nextToken()); // 빨강 + 노랑 동시에 켜지는 시간
		int T = Integer.parseInt(br.readLine()); // 하루 시간
		int cycleTime = g + gb + y + r + ry; // 신호등 전체 주기
		int redInCycle = r + ry; // 주기 내 빨강 불 시간
		int yellowInCycle = y + ry; // 주기 내 노랑 불 시간
		int greenInCycle = g + gb / 2; // 주기 내 초록 불 시간
		int fullCycles = T / cycleTime; // 하루 동안 반복되는 주기 횟수
		int remainder = T % cycleTime;
		int redTotal = fullCycles * redInCycle; // 하루 동안 빨강이 켜진 시간
		int yellowTotal = fullCycles * yellowInCycle; // 하루 동안 노랑이 켜진 시간
		int greenTotal = fullCycles * greenInCycle; // 하루 동안 초록이 켜진 시간
		// 초록 구간
		int use = Math.min(remainder, g);
		greenTotal += use;
		remainder -= use;
		// 깜빡 초록 구간
		if (remainder > 0) {
			use = Math.min(remainder, gb);
			greenTotal += use / 2;
			remainder -= use;
		}
		// 노랑 구간
		if (remainder > 0) {
			use = Math.min(remainder, y);
			yellowTotal += use;
			remainder -= use;
		}
		// 빨강 구간
		if (remainder > 0) {
			use = Math.min(remainder, r);
			redTotal += use;
			remainder -= use;
		}
		// 빨강 + 노랑 구간
		if (remainder > 0) {
			use = Math.min(remainder, ry);
			redTotal += use;
			yellowTotal += use;
			remainder -= use;
		}
		System.out.println(redTotal + " " + yellowTotal + " " + greenTotal); // 빨강, 노랑, 초록 출력
		br.close();
	}
}
