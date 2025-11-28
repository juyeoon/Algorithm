import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/24603
// 각 재료의 양 a를 읽어서 비례식으로 스케일링
public class B24603_Scaling_Recipe {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 재료 개수
		long x = Long.parseLong(st.nextToken()); // 원래 레시피 분량
		long y = Long.parseLong(st.nextToken()); // 필요 분량
		for (int i = 0; i < n; i++) {
			long a = Long.parseLong(br.readLine());
			long scaled = a * y / x;
			sb.append(scaled).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
