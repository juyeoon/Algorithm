import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 브루트포스로 구하기
public class B2559_수열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]); // 온도를 측정한 전체 날짜의 수
		int K = Integer.parseInt(s[1]); // 합을 구하기 위한 연속적인 날짜 수
		int n[] = new int[N]; // 온도
		s = br.readLine().split(" ");
		for (int i = 0; i < N; i++) { // input n[]
			n[i] = Integer.parseInt(s[i]);
		}
		int max = Integer.MIN_VALUE; // 가장 큰 온도의 합
		for (int i = 0; i < N - K + 1; i++) { // 시작 인덱스
			int sum = 0; // 온도의 합
			for (int j = i; j < i + K; j++) { // 시작 인덱스부터 K개
				sum += n[j]; // 합하기
			}
			max = Math.max(max, sum); // 이전에 구했던 최댓값과 지금의 합을 비교해서 큰 값으로 갱신
		}
		System.out.println(max); // 출력
		br.close();
	}
}