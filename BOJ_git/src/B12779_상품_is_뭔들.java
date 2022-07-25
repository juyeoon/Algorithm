import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 약수가 홀수개 => 제곱수
// a의 제곱근부터 b까지 제곱수가 몇 개인지 확인
public class B12779_상품_is_뭔들 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		long cnt = 0; // a와 b 사이의 제곱수의 개수
		long temp = (long) Math.sqrt(a); // a 제곱근
		for (long i = temp;; i++) {
			if (i * i > b)
				break;
			if (i * i <= b && i * i > a)
				cnt++;
		}
		if (cnt == 0) { // 확률이 0일 때
			System.out.println(0);
		} else {
			long gcd = GCD(b - a, cnt); // 전체 개수와 제곱수 개수의 최대공약수
			System.out.println(cnt / gcd + "/" + ((b - a) / gcd)); // 확률을 기약분수로
		}
		br.close();
	}

	// 유클리드 호제법으로 최대공약수 구하기
	public static long GCD(long a, long b) {
		if (b == 0) {
			return a;
		}
		return GCD(b, a % b);
	}
}
