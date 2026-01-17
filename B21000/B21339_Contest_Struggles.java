import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/21339
// 안 푼 문제의 평균: (d*n - s*k) / (n-k)
public class B21339_Contest_Struggles {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 전체 문제 개수
		int k = Integer.parseInt(st.nextToken()); // 푼 문제 개수
		st = new StringTokenizer(br.readLine());
		int d = Integer.parseInt(st.nextToken()); // 전체 평균 난이도
		int s = Integer.parseInt(st.nextToken()); // 푼 문제의 난이도
		int rSum = d * n - s * k; // 안 푼 문제의 난이도 합
		double rAvg = (double) rSum / (n - k); // 안 푼 문제의 평균 난이도
		if (0 <= rAvg && rAvg <= 100) { // 평균 난이도가 범위에 맞으면
			System.out.printf("%.6f", rAvg);
		} else { // 범위에 안 맞으면
			System.out.println("impossible");
		}
		br.close();
	}
}
