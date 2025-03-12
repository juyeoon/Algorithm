import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 총 시간 => 휴식시간 + 공부시간 => ((공부 계획 개수 - 1) * 8) + 입력값 총 합
// 일 => 총 시간 / 24, 시간 => 총 시간 % 24
public class B28097_모범생_포닉스 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 공부 계획 개수
		String s[] = br.readLine().split(" ");
		int ans = (N - 1) * 8; // 총 시간. 휴식 시간 계산
		for (int i = 0; i < N; i++) {
			ans += Integer.parseInt(s[i]); // 공부 시간 추가
		}
		sb.append(ans / 24).append(" ").append(ans % 24); // 일 시간
		System.out.println(sb); // 출력
		br.close();
	}
}