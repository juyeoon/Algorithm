import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 서로 다른 N개의 자연수의 합이 정해져 있을 때 N이 최대값이려면 1부터 N까지의 합이어야 함
// 따라서 N(N+1)/2 <= S가 성립
// N(N+1) <= S*2
// S*2의 제곱근을 구한 후 그 값이 N(작은 쪽)일지 N+1(큰 쪽)일지 확인한 후 N출력
public class B1789_수들의_합 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long S = Long.parseLong(br.readLine());
		long sqrt = (long) Math.sqrt(S * 2); // S*2의 제곱근
		if (sqrt * (sqrt + 1) <= 2 * S) { // 제곱근이 N(작은 쪽)일 때
			System.out.println(sqrt);
		} else { // 제곱근이 N+1(큰 쪽)일 때
			System.out.println(sqrt - 1);
		}
		br.close();
	}
}