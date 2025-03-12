import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/32941
// boolean 변수를 사용해서 건우가 예약한 교시에 모든 조원이 참석할 수 있는지 확인
// 각 조원이 가능한 교시에 건우가 예약한 교시가 없으면 모든 조원 참석 불가
// 있으면 다음 조원 확인
public class B32941_왜_맘대로_예약하냐고 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken()); // 교실을 예약할 수 있는 교시의 개수
		int X = Integer.parseInt(st.nextToken()); // 건우가 예약한 교시
		int N = Integer.parseInt(br.readLine()); // 조원의 수
		boolean possible = true; // 건우가 예약한 교시에 모든 조원이 참석할 수 있는지 (true: 가능)
		for (int i = 0; i < N; i++) {
			int K = Integer.parseInt(br.readLine()); // 조원이 예약할 수 있는 교시의 개수
			st = new StringTokenizer(br.readLine());
			boolean exist = false; // 해당 조원이 건우가 예약한 교시에 참석할 수 있는지 (true: 가능)
			for (int j = 0; j < K; j++) {
				if (Integer.parseInt(st.nextToken()) == X) { // 존재하면
					exist = true; // 참석 가능
					break;
				}
			}
			if (!exist) { // 존재하지 않으면
				possible = false; // 모든 조원 참석 불가
				break;
			}
		}
		System.out.println(possible ? "YES" : "NO"); // 출력
		br.close();
	}
}