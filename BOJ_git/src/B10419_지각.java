import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// s(지각 시간)^2+s가 d(수업시간)를 넘을 때까지 반복. 넘을 시점의 s-1을 출력
public class B10419_지각 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			int d = Integer.parseInt(br.readLine()); // 수업 시간
			int ans = 0; // 최대 지각 시간
			for (int s = 1; s <= d; s++) {
				if (s * s + s > d) { // (지각 시간) + (지각 시 수업 시간)이 (수업 시간)을 넘으면
					ans = s - 1; // (최대 지각 시간) = (넘을 시점의 지각 시간) - 1
					break;
				}
			}
			sb.append(ans).append("\n");
		}
		System.out.println(sb); // 출력
		br.readLine();
	}
}
