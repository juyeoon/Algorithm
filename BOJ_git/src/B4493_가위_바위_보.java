import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// if-else로 가위바위보의 경우의 수를 구분 후 각 테스트케이스의 총 점수를 비교하여 결과 출력
public class B4493_가위_바위_보 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			int N = Integer.parseInt(br.readLine()); // 경기 횟수
			int s1 = 0; // player 1 승리 횟수
			int s2 = 0; // player 2 승리 횟수
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				char p1 = st.nextToken().charAt(0); // player 1이 낸 것
				char p2 = st.nextToken().charAt(0); // player 2이 낸 것
				if (p1 == 'R') { // 묵
					if (p2 == 'S') { // 찌
						s1++;
					} else if (p2 == 'P') { // 빠
						s2++;
					}
				} else if (p1 == 'S') { // 찌
					if (p2 == 'R') { // 묵
						s2++;
					} else if (p2 == 'P') { // 빠
						s1++;
					}
				} else { // 빠
					if (p2 == 'R') { // 묵
						s1++;
					} else if (p2 == 'S') { // 찌
						s2++;
					}
				}
			}
			if (s1 == s2) { // 승리 횟수가 동일하면
				sb.append("TIE\n");
			} else if (s1 > s2) { // 1이 더 많이 승리했으면
				sb.append("Player 1\n");
			} else { // 2가 더 많이 승리했으면
				sb.append("Player 2\n");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}