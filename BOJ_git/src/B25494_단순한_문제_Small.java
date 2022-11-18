import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 조건을 만족하는 쌍은 x,y,z 숫자가 같고,
// x,y,z가 모두 a,b,c 넘지 않아야 함
public class B25494_단순한_문제_Small {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 1; tc <= T; tc++) {
			int min = Integer.MAX_VALUE; // a,b,c 중 최솟값
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 3; i++) { // 최솟값 세팅
				min = Math.min(min, Integer.parseInt(st.nextToken()));
			}
			sb.append(min).append("\n"); // 개수이므로 최솟값과 같음
		}
		System.out.println(sb); // 출력
		br.close();
	}
}