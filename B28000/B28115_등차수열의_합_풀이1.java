import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 두 등차수열의 각 항을 합하여 만든 수열은 등차수열 (Ai = (B1+C1) + (i-1)(dB+dC))
// N == 1일 때는 무조건 B와 C가 존재하며 입력값과 0을 출력
// 풀이 1: 주어진 등차수열 A의 첫 번째 항과 등차를 구하여 A가 등차수열인지 확인
// 등차수열이 아니면 No
// 등차수열이면 B의 첫 번째 항을 -1, C의 첫번째 항을 a1-b1
// C의 등차를 -1, B의 등차를 da-dc
// 그렇게 두는 이유는 첫째 항이 큰 값의 등차를 작게, 첫째 항이 작은 값의 등차를 크게 해서 두 수열의 모든 항이 제한 범위 (+-10^18) 안에 존재하게 만들기 위해
// 시간: 460 ms
public class B28115_등차수열의_합_풀이1 {
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
			int a2 = Integer.parseInt(st.nextToken()); // A의 두 번째 항
			int da = a2 - a1; // A의 등차
			int nowA = a2; // 현재 Ai 항의 값
			boolean aFlag = true; // A의 등차수열 여부를 저장(true: 등차수열)
			for (int i = 2; i < N; i++) { // 3번쨰 항부터 확인
				if (nowA + da != Integer.parseInt(st.nextToken())) { // 등차수열이 아니면
					aFlag = false;
					break;
				}
				nowA += da; // 다음 항 계산
			}
			if (!aFlag) { // A가 등차수열이 아니면
				sb.append("NO");
			} else { // A가 등차수열이면
				sb.append("YES\n");
				long b1 = -1; // B의 첫 번째 항
				long c1 = a1 - b1; // C의 첫 번째 항
				long dc = -1; // C의 등차
				long db = da - dc; // B의 등차
				long b = b1; // Bi
				long c = c1; // Ci
				for (int i = 0; i < N; i++) { // B의 모든 항 구하기
					sb.append(b).append(" ");
					b += db;
				}
				sb.append("\n");
				for (int i = 0; i < N; i++) { // C의 모든 항 구하기
					sb.append(c).append(" ");
					c += dc;
				}
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}