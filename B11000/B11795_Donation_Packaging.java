import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/11795
public class B11795_Donation_Packaging {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		int[] sum = new int[3]; // 세트 누적 수량
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			sum[0] += Integer.parseInt(st.nextToken()); // 누적 수량 갱신
			sum[1] += Integer.parseInt(st.nextToken());
			sum[2] += Integer.parseInt(st.nextToken());
			if (sum[0] >= 30 && sum[1] >= 30 && sum[2] >= 30) { // 모든 세트가 30개 이상일 때 기부 가능
				int out = Math.min(sum[0], Math.min(sum[1], sum[2])); // 세트의 최솟값 = 기부값
				for (int i = 0; i < 2; i++) { // 각 세트에서 기부값 빼기
					sum[i] -= out;
				}
				sb.append(out); // 기부값 출력
			} else { // 기부할 수 없음
				sb.append("NO");
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
