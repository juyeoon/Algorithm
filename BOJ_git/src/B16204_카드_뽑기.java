import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// O, X 각각 적혀있는 개수와 적을 개수 중 최솟값을 구한 후, 합 출력
public class B16204_카드_뽑기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]); // 전체 카드 개수
		int M = Integer.parseInt(s[1]); // O 적힌 개수
		int K = Integer.parseInt(s[2]); // O 적을 개수
		System.out.println(Math.min(M, K) + Math.min(N - M, N - K)); // O 최소 개수 + X 최소 개수
		br.close();
	}
}