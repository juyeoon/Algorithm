import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 운동 시 n만큼 체중 감소, 먹이를 줄 시 n만큼 체중 증가
// 중간에 체중이 0 이하가 되면 사망 => flag 설정
// 각 테스트케이스가 끝났을 때 현재 체중에 따라 출력
// 주의 : 입력을 위한 반복문에세 break를 사용하게 되면 계속 런타임 에러 발생
public class B1362_펫 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String s = "";
		int T = 1; // 테스트케이스(출력 형식 맞추기)
		while (!(s = br.readLine()).equals("0 0")) { // EOI
			st = new StringTokenizer(s);
			int o = Integer.parseInt(st.nextToken()); // 적정 체중
			int w = Integer.parseInt(st.nextToken()); // 현재 체중
			boolean death = false; // 사망 여부 (true: 죽음)
			while (!(s = br.readLine()).equals("# 0")) { // 테스트케이스 EOI
				st = new StringTokenizer(s);
				char c = st.nextToken().charAt(0); // 펫에게 가할 작용
				int n = Integer.parseInt(st.nextToken()); // 작용 수
				if (c == 'E') { // 운동
					w -= n; // 체중 n만큼 감소
				} else { // 먹이
					w += n; // 체중 n만큼 증가
				}
				if (w <= 0) { // 중간에 체중이 0이하가 되면 사망
					death = true;
					// ======== 여기서 break를 사용하게 되면 계속 런타임 에러 발생 ==========
				}
			}
			sb.append(T++).append(" "); // 출력 형식 맞추기
			if (death) { // 사망 했을 시
				sb.append("RIP");
			} else if ((o * 0.5) < w && w < (2 * o)) { // 행복할 조건
				sb.append(":-)");
			} else { // 그 외에는 슬픔
				sb.append(":-(");
			}
			sb.append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}