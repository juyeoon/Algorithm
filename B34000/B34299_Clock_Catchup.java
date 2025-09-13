import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/34299
// 정전 시작(t1)부터 복구(t2)까지의 시간을 초 단위로 구한 후 각 침이 12에 올라오는 횟수 구하기
// 초침이 12에 올라오는 횟수: (t1, t2] 구간에서 60의 배수 개수
// 분침이 12에 올라오는 횟수: (t1, t2]에서 3600의 배수 개수
// 시침이 12에 올라오는 횟수: 같은 날에서는 12:00:00만 고려
public class B34299_Clock_Catchup {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		int h1 = Integer.parseInt(st.nextToken());
		int m1 = Integer.parseInt(st.nextToken());
		int s1 = Integer.parseInt(st.nextToken());
		int t1 = h1 * 3600 + m1 * 60 + s1; // 자정부터 정전 발생까지의 시간(초)
		st = new StringTokenizer(br.readLine(), ":");
		int h2 = Integer.parseInt(st.nextToken());
		int m2 = Integer.parseInt(st.nextToken());
		int s2 = Integer.parseInt(st.nextToken());
		int t2 = h2 * 3600 + m2 * 60 + s2; // 자정부터 복구까지의 시간(초)
		int sec = (t2 / 60) - (t1 / 60); // 초침이 12에 올라오는 횟수
		int min = (t2 / 3600) - (t1 / 3600); // 분침이 12에 올라오는 횟수
		int hour = (t1 < 12 * 3600 && t2 >= 12 * 3600) ? 1 : 0; // 시침이 12에 올라오는 횟수
		System.out.println(hour + " " + min + " " + sec);
		br.close();
	}
}
