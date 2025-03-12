import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 강산이가 캠핑장을 최대로 사용할 수 있는 일 수 => 연속 P일 횟수 * L + 나머지 날
// => (V / P * L) + (V % P)
// 그러나 (V % P)가 L보다 클 수 있으므로 (V % P)를 Math.min(L, (V % P))로 바꿔야 함
// => (V / P * L) + Math.min(L, (V % P))
public class B4796_캠핑 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String s = "";
		int T = 0; // 테스트케이스
		while (!(s = br.readLine()).equals("0 0 0")) { // EOF
			st = new StringTokenizer(s);
			sb.append("Case ").append(++T).append(": ");
			int L = Integer.parseInt(st.nextToken()); // 캠핑장을 사용할 수 있는 일 수
			int P = Integer.parseInt(st.nextToken()); // 연속하는 P일
			int V = Integer.parseInt(st.nextToken()); // V짜리 휴가
			sb.append((V / P * L) + Math.min(L, (V % P))).append("\n"); // 캠핑장을 최대로 사용할 수 있는 일 수
		}
		System.out.println(sb); // 출력
		br.close();
	}
}