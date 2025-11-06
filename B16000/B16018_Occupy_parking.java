import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/16018
// 어제와 오늘 모두 주차된 칸('C')의 개수를 세는 문제
public class B16018_Occupy_parking {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 주차 공간 수
		String yesterday = br.readLine(); // 어제 주차 상태
		String today = br.readLine(); // 오늘 주차 상태
		int cnt = 0; // 어제와 오늘 모두 주차된 칸 수
		// N개의 주차 공간을 차례로 비교
		for (int i = 0; i < N; i++) {
			if (yesterday.charAt(i) == 'C' && today.charAt(i) == 'C') {
				cnt++;
			}
		}
		System.out.println(cnt);
		br.close();
	}
}
