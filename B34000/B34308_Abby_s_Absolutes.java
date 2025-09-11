import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/34308
// 1과의 개수 차이와 상한값과의 개수 차이를 구한 후 더 작은 값으로 출력
public class B34308_Abby_s_Absolutes {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // Abby가 많이 사줄 때의 사과 개수
		int K = Integer.parseInt(st.nextToken()); // Abby가 마트에 다녀올 횟수
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < K; i++) {
			int num = Integer.parseInt(st.nextToken()); // 원하는 사과의 개수
			int diffOne = num - 1; // 1과의 개수 차이
			int diffN = N - num; // 상한값과의 개수 차이
			sb.append((diffN < diffOne) ? N : 1).append(" "); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
