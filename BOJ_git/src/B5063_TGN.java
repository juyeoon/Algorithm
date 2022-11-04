import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 광고를 했을 때의 순수익과 광고를 하지 않았을 때의 순수익을 비교
public class B5063_TGN {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			// 광고를 하지 않았을 때의 순수익 - 광고를 했을 때의 순수익(광고 수익 - 광고비)
			int noAdRevenue = Integer.parseInt(st.nextToken())
					- (Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken()));
			if (noAdRevenue == 0) { // 순수익이 같을 때
				sb.append("does not matter\n");
			} else if (noAdRevenue < 0) { // 광고를 하지 않았을 때의 순수익이 더 클 때
				sb.append("advertise\n");
			} else { // 광고를 했을 때의 순수익이 더 클 때
				sb.append("do not advertise\n");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}