import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 34798 - Missed Alarm
// https://www.acmicpc.net/problem/34798
// 일어난 시각과 알람 설정 시각을 각각 분 단위로 변환한 후 비교하여 조건에 맞게 출력
public class B34798_Missed_Alarm {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		int H1 = Integer.parseInt(st.nextToken()); // 알람 설정 시각
		int M1 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), ":");
		int H2 = Integer.parseInt(st.nextToken()); // 일어난 시각
		int M2 = Integer.parseInt(st.nextToken());
		int time1 = H1 * 60 + M1; // 분 단위로 변환
		int time2 = H2 * 60 + M2;
		System.out.println(time1 < time2 ? "YES" : "NO"); // 출력
		br.close();
	}
}
