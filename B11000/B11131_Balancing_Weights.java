import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/11131
// 입력된 수들의 합을 구한 후 음수, 양수, 0인지 확인하여 출력하는 문제
public class B11131_Balancing_Weights {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스
		for (int tc = 0; tc < T; tc++) {
			int N = Integer.parseInt(br.readLine()); // 가중치 개수
			StringTokenizer st = new StringTokenizer(br.readLine());
			int sum = 0; // 가중치 합
			for (int i = 0; i < N; i++) { // sum 구하기
				sum += Integer.parseInt(st.nextToken());
			}
			if (sum < 0) { // 왼쪽으로 기욺
				sb.append("Left");
			} else if (sum > 0) { // 오른쪽으로 기욺
				sb.append("Right");
			} else { // 평형
				sb.append("Equilibrium");
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
