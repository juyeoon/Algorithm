import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/25965
// 킬 수 * 킬 당 미션금 - 데스 수 * 데스 당 미션금 + 어시스트 수 * 어시스트 당 미션금이 양수면 총 미션금에 추가하여 총 미션금 출력
public class B25965_미션_도네이션 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 총 게임의 수
		for (int i = 0; i < n; i++) {
			int M = Integer.parseInt(br.readLine()); // 총 미션의 수
			long mission[][] = new long[M][3]; // 각 미션들의 조건
			for (int j = 0; j < M; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				mission[j][0] = Long.parseLong(st.nextToken()); // 킬당 추가해야 하는 금액
				mission[j][1] = Long.parseLong(st.nextToken()); // 데스당 차감해야 하는 금액
				mission[j][2] = Long.parseLong(st.nextToken()); // 어시스트당 추가해야 하는 금액
			}
			long kda[] = new long[3]; // 순범이의 킬, 데스, 어시스트
			StringTokenizer st = new StringTokenizer(br.readLine());
			kda[0] = Long.parseLong(st.nextToken());
			kda[1] = Long.parseLong(st.nextToken());
			kda[2] = Long.parseLong(st.nextToken());
			long sum = 0; // 총 미션금
			for (int j = 0; j < M; j++) {
				long price = mission[j][0] * kda[0] - mission[j][1] * kda[1] + mission[j][2] * kda[2]; // 미션금
				if (price > 0) { // 미션금이 양수면 총 금액에 추가
					sum += price;
				}
			}
			sb.append(sum).append("\n"); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
