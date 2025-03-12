import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 전체 쿠키 수를 하루에 먹는 쿠키 수로 나누고 나머지가 있으면 + 1
public class B11134_쿠키애호가 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); // 가지고 있는 쿠키 수
			int C = Integer.parseInt(st.nextToken()); // 하루에 먹는 쿠키 수
			if (N % C == 0) { // 마지막 날에 C개를 먹을 수 있으면
				sb.append(N / C).append("\n");
			} else { // 마지막 날에 C개 이하를 먹으면
				sb.append(N / C + 1).append("\n");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}