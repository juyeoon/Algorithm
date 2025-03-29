import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/13528
// 총 비용 = (잔디밭 넓이 * 제곱미터당 비용)의 합
// = (잔디밭 너비 * 잔디밭 길이 * 제곱미터당 비용)의 합
public class B13528_Grass_Seed_Inc {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double C = Double.parseDouble(br.readLine()); // 제곱미터의 잔디에 뿌리는 데 필요한 씨앗 비용
		int L = Integer.parseInt(br.readLine()); // 한 줄에 심을 잔디의 수
		double ans = 0.0; // 총 비용
		for (int i = 0; i < L; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double w = Double.parseDouble(st.nextToken()); // 잔디밭 너비
			double l = Double.parseDouble(st.nextToken()); // 잔디밭 길이
			double area = w * l; // 잔디밭 넓이
			ans += area * C; // 비용 추가
		}
		System.out.printf("%.6f\n", ans); // 출력
		br.close();
	}
}
