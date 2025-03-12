import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 유클리드 호제법으로 최대공약수를 구하여 각 수를 나누기
public class B14490_백대열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ":"); // n:m
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int gcd = GCD(n, m); // n과 m의 최대 공약수
		System.out.println(n / gcd + ":" + m / gcd); // 출력
		br.close();
	}

	// 유클리드 호제법으로 최대공약수 구하기
	public static int GCD(int a, int b) {
		if (a % b == 0) {
			return b;
		}
		return GCD(b, a % b);
	}
}
