import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1차전 2차전 합계가 같지 않으면 합계가 더 큰 팀이 승리
// 같으면 원정에서의 점수가 더 큰 팀이 승리
// 원정 점수도 같으면 패널티킥
public class B16727_ICPC {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		int p1 = Integer.parseInt(st.nextToken()); // 1차전 홈 팀 Persepolis 점수
		int s1 = Integer.parseInt(st.nextToken()); // 1차전 원정 팀 Esteghlal 점수
		st = new StringTokenizer(br.readLine());
		int s2 = Integer.parseInt(st.nextToken()); // 2차전 홈 팀 Esteghlal 점수
		int p2 = Integer.parseInt(st.nextToken()); // 2차전 원정 팀 Persepolis 점수
		if (p1 + p2 > s1 + s2) { // 점수 합계가 Persepolis가 더 크면
			System.out.println("Persepolis");
		} else if (p1 + p2 < s1 + s2) { // 점수 합계가 Esteghlal가 더 크면
			System.out.println("Esteghlal");
		} else { // 점수 합계가 같을 때
			if (p2 > s1) { // Persepolis가 원정에서 더 많은 점수를 냈으면
				System.out.println("Persepolis");
			} else if (p2 < s1) { // Esteghlal가 원정에서 더 많은 점수를 냈으면
				System.out.println("Esteghlal");
			} else { // 원정 점수도 같을 때
				System.out.println("Penalty");
			}
		}
		br.close();
	}
}