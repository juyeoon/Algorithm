import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 기약분수를 구하기 위해 유클리드 호제법으로 최대공약수 찾아서 나누기
public class B3036_링 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 링 개수
		String s[] = br.readLine().split(" ");
		int first = Integer.parseInt(s[0]); // 첫번째 링 반지름
		for (int i = 1; i < N; i++) { // 링마다 반복
			int other = Integer.parseInt(s[i]);
			int gcd = GCD(first, other); // 다른 링 반지름
			sb.append(first / gcd).append("/").append(other / gcd).append("\n"); // 기약 분수 형태로 sb에 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}

	// 최대공약수 구하기 - 유클리드 호제법, 재귀
	public static int GCD(int a, int b) {
		if (a % b == 0) {
			return b;
		}
		return GCD(b, a % b);
	}
}
