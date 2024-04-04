import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 산책 시작 시각과 산책 종료 시각이 주어졌을 때 걸린 시간(분)과 한 바퀴를 도는데 30분이 걸릴 때 한 바퀴를 돈 횟수를 구하는 문제
// 분 계산 이후 시 계산. 종료 시각에서 시작 시각을 뺐을 때 음수면 빌려오기
// 한 바퀴를 돈 횟수 => 걸린 시간(분) / 30
public class B24356_ЧАСОВНИК {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int t1 = Integer.parseInt(st.nextToken()); // 산책 시작 시각 (시)
		int m1 = Integer.parseInt(st.nextToken()); // 산책 시작 시각 (분)
		int t2 = Integer.parseInt(st.nextToken()); // 산책 종료 시각 (시)
		int m2 = Integer.parseInt(st.nextToken()); // 산책 종료 시각 (분)
		int sumM = 0; // 산책에 걸린 시간 (분)
		if (m2 - m1 < 0) { // 분 계산 시 빌려오기
			t2--;
			m2 += 60;
		}
		if (t2 - t1 < 0) { // 시 계산 시 빌려오기
			t2 += 24;
		}
		sumM = m2 - m1 + (t2 - t1) * 60; // 시간 계산
		System.out.println(sumM + " " + sumM / 30); // 출력
		br.close();
	}
}