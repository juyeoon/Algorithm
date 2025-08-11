import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/22380
// 1인당 부담금 = 파티 총 비용 / 참가자의 수
// 각 참가자는 소지금  < 1인당 부담금이면 가진 돈 전부를 내고 나머지는 후불 처리
// 오늘 당일에 모을 수 있는 금액 = 각 참가자가 낼 수 있는 금액의 합 = min(Ai, share) 합계
public class B22380_割り勘 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("0 0")) { // EOI
			StringTokenizer st = new StringTokenizer(s);
			int N = Integer.parseInt(st.nextToken()); // 참가자 수
			int M = Integer.parseInt(st.nextToken()); // 파티 총 비용
			int share = M / N; // 1인당 부담 금액
			long collected = 0; // 오늘 당일에 모을 수 있는 총 금액
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				int Ai = Integer.parseInt(st.nextToken()); // i번째 참가자의 소지금
				collected += Math.min(Ai, share); // 참가자가 낼 수 있는 금액
			}
			sb.append(collected).append('\n');
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
