import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/31125
// 주사위를 n개 굴릴 때 나올 수 있는 합의 범위: [n, n * f]
// m(보정치)을 더한 범위: [n + m, n * f + m]
public class B31125_Dice {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int B = Integer.parseInt(br.readLine()); // 스트라이크 횟수
		for (int i = 0; i < B; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int S = Integer.parseInt(st.nextToken()); // 보고된 합
			int n = Integer.parseInt(st.nextToken()); // 주사위 개수
			int f = Integer.parseInt(st.nextToken()); // 각 주사위 면 수
			int m = Integer.parseInt(st.nextToken()); // 보정치
			int minSum = n + m; // 최솟값: 주사위 전부 1 + m
			int maxSum = n * f + m; // 최댓값: 주사위 전부 f + m
			if (S >= minSum && S <= maxSum) { // S가 가능한 합의 범위에 포함되면
				sb.append("YES\n");
			} else {
				sb.append("NO\n");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
