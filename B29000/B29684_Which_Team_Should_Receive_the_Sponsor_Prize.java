import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/29684
// 각 팀의 정답 제출 시간을 입력받아 2023초와의 차이가 가장 작은 팀을 찾는 문제
// 제출 시간과 2023의 차이(|t - 2023|)를 계산한 후 가장 차이가 작은 팀의 번호를 저장하여 출력
public class B29684_Which_Team_Should_Receive_the_Sponsor_Prize {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("0")) { // EOI
			int n = Integer.parseInt(s); // 참가 팀 수
			StringTokenizer st = new StringTokenizer(br.readLine());
			int bestIdx = 1; // 정답과 가장 가까운 시간을 제출한 팀 번호
			int bestDiff = Integer.MAX_VALUE; // 최소 차이 값
			for (int i = 1; i <= n; i++) {
				int t = Integer.parseInt(st.nextToken()); // 제출 시간
				int diff = Math.abs(t - 2023); // 시간 차이
				if (diff < bestDiff) { // 최소 차이 갱신
					bestDiff = diff;
					bestIdx = i;
				}
			}
			sb.append(bestIdx).append("\n"); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
