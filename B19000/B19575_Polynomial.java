import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// x 인수로 묶어서 곱하고 더하고 곱하고 더하고 곱하고 더하고 반복
public class B19575_Polynomial {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 다항식의 차수
		int x = Integer.parseInt(st.nextToken()); // x값
		int m = 1000000007; // mod 값
		int[] num = new int[N + 1]; // 계수 저장(인덱스: 차수)
		for (int i = N; i >= 0; i--) { // 제일 높은 차수의 계수부터 입력되므로 인덱스 뒤에서부터 받음
			st = new StringTokenizer(br.readLine());
			num[i] = Integer.parseInt(st.nextToken());
		}
		long ans = num[N]; // 다항식 결과값
		for (int i = N; i > 0; i--) { // 큰 차수부터 계산
			ans *= x; // 곱하고
			ans %= m; // (mod)
			ans += num[i - 1]; // 더한다
		}
		System.out.println(ans % m); // 출력
		br.close();
	}
}
