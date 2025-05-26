import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/33868
// 최대 곱이 7,500,000이므로 int로 충분하므로 문제에 맞춰서 구현하기만 하면 됨
public class B33868_스티커_나눠주기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int maxT = Integer.MIN_VALUE; // 가장 큰 시간 T
		int minB = Integer.MAX_VALUE; // 가장 짧은 코드 길이 B
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int T = Integer.parseInt(st.nextToken()); // T
			int B = Integer.parseInt(st.nextToken()); // B
			maxT = Math.max(maxT, T); // 최대 T 찾기
			minB = Math.min(minB, B); // 최소 B 찾기
		}
		int ans = maxT * minB; // 곱
		System.out.println(ans % 7 + 1); // 출력
		br.close();
	}
}
