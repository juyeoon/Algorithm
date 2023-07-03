import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 테스트케이스 별 연봉을 비교하여 최대 연봉보다 높은 연봉일 때 선수 이름과 최대 연봉을 갱신
public class B11098_첼시를_도와줘 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			int p = Integer.parseInt(br.readLine()); // 선수의 수
			int max = Integer.MIN_VALUE; // 최대 연봉
			String name = ""; // 최대 연봉 선수 이름
			for (int i = 0; i < p; i++) {
				st = new StringTokenizer(br.readLine());
				int c = Integer.parseInt(st.nextToken()); // 선수 연봉
				if (max < c) { // 최고 연봉일 때
					max = c; // 최대값 갱신
					name = st.nextToken(); // 선수 이름 갱신
				}
			}
			sb.append(name).append("\n"); // 최대 연봉 출력
		}
		System.out.println(sb); // 출력
		br.readLine();
	}
}