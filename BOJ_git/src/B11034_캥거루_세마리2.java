import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 캥거루 이동 횟수를 최대로 하려면 가운데 캥거루와 다른 캥거루 사이의 거리가 큰 캥거루 사이로 나머지 캥거루를 이동
// 이동하는 캥거루를 다른 캥거루 둘 중 아무 캥거루 바로 옆으로 하면 다른 캥거루와의 거리가 최대가 되어 더 많이 이동 가능
public class B11034_캥거루_세마리2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String s = "";
		while ((s = br.readLine()) != null) { // 테스트케이스 EOI
			st = new StringTokenizer(s);
			int A = Integer.parseInt(st.nextToken()); // 캥거루 위치 1
			int B = Integer.parseInt(st.nextToken()); // 캥거루 위치 2
			int C = Integer.parseInt(st.nextToken()); // 캥거루 위치 3
			int cnt = 0; // 캥거루 이동 횟수
			while (B - A > 1 || C - B > 1) { // 세마리의 사이가 모두 1이면 이동 불가
				cnt++; // 카운트
				if (B - A < C - B) { // AB 거리 보다 BC 거리가 더 크면
					A = B; // C를 이동
				} else { // 그 외
					C = B; // A를 이동
				}
				B = A + 1; // 중앙 위치 캥거루(이동한 캥거루)를 왼쪽 캥거루 바로 옆으로 이동
				;
			}
			sb.append(cnt).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}