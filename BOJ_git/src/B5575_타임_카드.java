import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 초 분 시 순서로 계산
public class B5575_타임_카드 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		for (int tc = 0; tc < 3; tc++) { // 3번 반복
			st = new StringTokenizer(br.readLine());
			int t[] = new int[6];
			for (int i = 0; i < 6; i++) { // input
				t[i] = Integer.parseInt(st.nextToken());
			}
			for (int i = 5; i > 2; i--) { // 초 분 시 순서로 계산
				if (t[i - 3] > t[i]) { // 퇴근 시간의 (초/분/시)가 더 크면 빌려오기
					t[i - 1]--;
					t[i] += 60;
				}
				sb.insert(0, (t[i] - t[i - 3]) + " "); // 빌더의 앞에 저장
			}
			System.out.println(sb); // 출력
			sb.setLength(0);
		}
		br.close();
	}
}
