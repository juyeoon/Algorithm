import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 첨탑을 순회하면서 이전 첨탑의 높이가 현재 첨탑 이하면 밀 수 없으므로 카운트 후 이전 첨탑 높이를 현재 첨탑 높이로 갱신
// 입력의 개수가 많으므로(첨탑의 개수 < 5,000,000) split 보다 StringTokenizer 사용하기 (1260-> 896)
public class B28014_첨탑_밀어서_부수기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 첨탑 개수
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = 0; // 밀어야하는 개수
		int pre = 0; // 이전 첨탑의 높이
		for (int i = 0; i < N; i++) {
			int now = Integer.parseInt(st.nextToken()); // 현재 첨탑의 높이
			if (pre <= now) { // 이전 첨탑으로 현재 첨탑을 밀 수 없으면
				cnt++;
			}
			pre = now; // 이전 첨탑의 높이를 현재의 첨탑의 높이로
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}
