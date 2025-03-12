import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 수빈이와 동생들의 거리 차를 구한 후, 유클리드 호제법으로 모든 수의 최대공약수 구하기
// 여러 수의 최대공약수 구하는 법 -> 2개의 최대공약수와 다른 수의 최대공약수를 구한 후 그 최대공약수와 또 다른 수의 최대공약수를 구하는 방식을 반복
public class B17087_숨바꼭질_6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 동생의 수
		int S = Integer.parseInt(st.nextToken()); // 수빈의 위치
		int diff[] = new int[N]; // 수빈과 동생의 거리 차
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) { // input diff[]
			diff[i] = Math.abs(Integer.parseInt(st.nextToken()) - S);
		}
		int gcd = diff[0]; // 처음 수를 최대공약수라고 설정
		for (int i = 1; i < N; i++) {
			gcd = GCD(gcd, diff[i]); // 현재까지의 최대공약수와 다른 거리 차의 최대공약수를 구함
		}
		System.out.println(gcd); // 최종 최대공약수를 구함
		br.close();
	}

	// 유클리드호제법으로 최대공약수 구하기
	public static int GCD(int a, int b) {
		if (b == 0) {
			return a;
		}
		return GCD(b, a % b);
	}
}