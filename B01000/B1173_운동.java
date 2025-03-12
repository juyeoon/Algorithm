import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 최솟값 => 맥박이 증가하면 최대 맥박을 넘을 때만 1분 휴식. 운동 횟수가 N번을 만족할 때까지 반복
// 운동을 N분 할 수 없는 경우 => 운동이 가능한 최대 맥박이 신체의 최소 맥박보다 낮을 때는 운동 불가능(운동이 가능한 맥박으로 떨어지지 않음)
public class B1173_운동 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]); // 운동하는 시간
		int m = Integer.parseInt(s[1]); // 최소 맥박
		int M = Integer.parseInt(s[2]); // 최대 맥박
		int T = Integer.parseInt(s[3]); // 맥박 증가값
		int R = Integer.parseInt(s[4]); // 맥박 감소값
		int max = M - T; // 운동이 가능한 최대 맥박
		if (max < m) { // 운동이 가능한 최대 맥박이 최소 맥박보다 작으면 운동 불가능
			System.out.println(-1);
		} else {
			int X = m; // 현재 맥박
			int cnt = 0; // 최소 시간(운동+휴식)
			while (N > 0) { // 운동횟수를 만족할 때까지 반복
				cnt++; // 시간 갱신
				if (X <= max) { // 운동 가능한 최대 맥박 이하일 때
					N--; // 운동
					X += T; // 맥박 갱신
				} else { // 운동 가능한 최대 맥박 이상일 때
					X = (X - R < m) ? m : X - R; // R만큼 감소 단, m이하일 때 m
				}
			}
			System.out.println(cnt); // 시간 출력
		}
		br.close();
	}
}