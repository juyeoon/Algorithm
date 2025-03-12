import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 인접한 두 수의 사이의 정수 개수 중 최댓값이 횟수의 최댓값
// (가장 큰 값 - 중간값 - 1), (중간값 - 가장 작은 값 - 1) 중 최댓값
public class B2965_캥거루_세마리 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int A = Integer.parseInt(s[0]); // 최솟값
		int B = Integer.parseInt(s[1]); // 중간값
		int C = Integer.parseInt(s[2]); // 최댓값
		System.out.println(Math.max(C - B - 1, B - A - 1)); // (가장 큰 값 - 중간값 - 1), (중간값 - 가장 작은 값 - 1) 중 최댓값 출력
		br.close();
	}
}