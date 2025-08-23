import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/15340
// 비용 = 통화 시간 * 통화 요금 + 데이터 양 * 데이터 요금
// 을 세 통신사에 대해 계산하고 최솟값을 출력
public class B15340_Sim_Card {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[][] rates = { { 30, 40 }, { 35, 30 }, { 40, 20 } }; // 통신사 요금
		String s = "";
		while (!(s = br.readLine()).equals("0 0")) { // EOI
			StringTokenizer st = new StringTokenizer(s);
			int c = Integer.parseInt(st.nextToken()); // 통화 시간
			int d = Integer.parseInt(st.nextToken()); // 데이터 양
			int minCost = Integer.MAX_VALUE; // 최소 금액
			for (int[] rate : rates) {
				int call = rate[0]; // 통화 시간에 따른 요금
				int data = rate[1]; // 데이터 양에 따른 요금
				int cost = c * call + d * data; // 비용
				if (cost < minCost) { // 최솟값 갱신
					minCost = cost;
				}
			}
			sb.append(minCost).append('\n'); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
