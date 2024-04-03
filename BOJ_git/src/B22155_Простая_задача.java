import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 각 문제 별 조건문의 개수와 반복문의 개수가 주어졌을 때 쉬운 문제인지 판별하는 문제
// 쉬운 문제 => (조건문 1개 이하 & 반복문 2개 이하)이거나 (조건문 2개 이하 & 반복문 1개 이하)
public class B22155_Простая_задача {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int n = Integer.parseInt(br.readLine()); // 문제 개수
		for (int tc = 0; tc < n; tc++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken()); // 조건문 개수
			int j = Integer.parseInt(st.nextToken()); // 반복문 개수
			sb.append((i <= 2 && j <= 1) || (i <= 1 && j <= 2) ? "Yes\n" : "No\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}