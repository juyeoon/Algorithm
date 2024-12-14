import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/15818
// (A × B) % M = ((A % M) × (B % M)) % M
// 나머지의 곱을 구한 후 한 번 더 나머지 연산을 연산할 수만큼 반복
public class B15818_오버플로우와_모듈러 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 정수의 개수
		int M = Integer.parseInt(st.nextToken()); // 나머지 연산할 수
		long sum = 1; // 곱의 합의 나머지 = 나머지 곱의 합의 나머지
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) { // 정수의 개수
			int a = Integer.parseInt(st.nextToken()) % M; // 정수의 나머지
			sum *= a; // 답에 곱하기
			sum %= M; // 또 나머지 구하기
		}
		System.out.println(sum); // 출력
		br.close();
	}
}