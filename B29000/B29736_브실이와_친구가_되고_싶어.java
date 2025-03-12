import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 연립부등식
// 친구가 될 수 있는 범위의 최소 문제 수 => 사람들이 푼 문제 최소 개수와 친구 범위의 최소 문제 수 중 최대값
// 친구가 될 수 있는 범위의 최대 문제 수 => 사람들이 푼 문제 최대 개수와 친구 범위의 최대 문제 수 중 최솟값
public class B29736_브실이와_친구가_되고_싶어 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int A = Integer.parseInt(s[0]); // 사람들이 푼 문제 최소 개수
		int B = Integer.parseInt(s[1]); // 사람들이 푼 문제 최대 개수
		s = br.readLine().split(" ");
		int K = Integer.parseInt(s[0]); // 브실이가 푼 문제 수
		int X = Integer.parseInt(s[1]); // 범위
		int start = Math.max(A, K - X); // 친구가 될 수 있는 범위 최소 문제 개수
		int end = Math.min(B, K + X); // 친구가 될 수 있는 범위 최대 문제 개수
		System.out.println(end - start < 0 ? "IMPOSSIBLE" : end - start + 1); // 출력
		br.close();
	}
}