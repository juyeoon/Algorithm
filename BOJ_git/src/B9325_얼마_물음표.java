import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 자동차 가격 + (옵션 개수 * 옵션 가격)의 합을 출력
public class B9325_얼마_물음표 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			int sum = Integer.parseInt(br.readLine()); // 합
			int optionCnt = Integer.parseInt(br.readLine()); // 옵션 개수
			for (int i = 0; i < optionCnt; i++) {
				st = new StringTokenizer(br.readLine());
				sum += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()); // 옵션 개수 * 옵션 가격
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
