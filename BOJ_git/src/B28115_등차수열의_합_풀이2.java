import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 두 등차수열의 각 항을 합하여 만든 수열은 등차수열 (Ai = (B1+C1) + (i-1)(dB+dC))
// N == 1일 때는 무조건 B와 C가 존재하며 입력값과 0을 출력
// 풀이 2: 주어진 등차수열 A의 첫 번째 항과 등차를 구하고
// B와 C의 첫째 항과 등차를 계산하여
// A가 등차수열인지 매 항을 확인함과 동시에 해당 번째의 B와 C항을 구함
// B와 C의 첫째 항과 등차를 정한 규칙은 풀이 1과 동일
// 시간: 368 ms
public class B28115_등차수열의_합_풀이2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 항의 개수
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a1 = Integer.parseInt(st.nextToken()); // A의 첫 번재 항
		if (N == 1) { // 항이 1개면 항상 YES. 0과 a1으로 출력
			sb.append("YES\n");
			sb.append(a1).append("\n");
			sb.append(0);
		} else { // 항이 2개 이상
			int a = Integer.parseInt(st.nextToken()); // 현재 Ai 항의 값
			int da = a - a1; // A의 등차
			StringBuilder sbb = new StringBuilder(); // B의 수열의 항을 저장
			StringBuilder sbc = new StringBuilder(); // C의 수열의 항을 저장
			long dc = -1; // C의 등차
			long db = da - dc; // B의 등차
			long b = -1; // Bi
			long c = a1 - b; // Ci
			sbb.append(b).append(" "); // B 첫 번째 항 저장
			sbc.append(c).append(" "); // C 첫 번째 항 저장
			b += db; // B 다음 항 저장
			c += dc; // C 다음 항 저장
			sbb.append(b).append(" "); // B 두 번째 항 저장
			sbc.append(c).append(" "); // C 두 번째 항 저장
			boolean yesFlag = true; // A의 등차수열 여부를 저장(true: 등차수열)
			for (int i = 2; i < N; i++) {
				if (a + da != Integer.parseInt(st.nextToken())) { // A 등차수열 여부 확인
					yesFlag = false; // 등차수열이 아니면
					break;
				}
				a += da; // A 갱신
				b += db; // B 갱신
				c += dc; // C 갱신
				sbb.append(b).append(" "); // B 항 저장
				sbc.append(c).append(" "); // C 항 저장
			}
			if (yesFlag) { // A가 등차수열이면
				sb.append("YES\n");
				sb.append(sbb.toString()).append("\n");
				sb.append(sbc.toString());
			} else { // A가 등차수열이 아니면
				sb.append("NO");
			}
		}

		System.out.println(sb); // 출력
		br.close();
	}
}