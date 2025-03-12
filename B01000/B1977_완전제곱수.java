import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// M 이상 N 이하의 수에서 완전제곱수인 값의 최솟값과 최댓값을 찾은 후
// 최솟값과 최댓값의 제곱근 사이의 자연수를 제곱하여 합을 구함
public class B1977_완전제곱수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine()); // M 이상
		int N = Integer.parseInt(br.readLine()); // N 이하
		int start = (int) Math.sqrt(M); // 제곱했을 때 M 이상인 최솟값
		if (start * start < M) { // M이 완전제곱수가 아니면 1을 더해야 함
			start++;
		}
		int end = (int) Math.sqrt(N); // 제곱했을 때 N 이상인 최댓값
		int sum = 0; // M 이상 N 이하 완전제곱수 합
		while (start <= end) { // M 이상 N 이하만 확인(뒤에서부터)
			sum += end * end; // 합 갱신
			end--; // 다음 값으로
		}
		System.out.println((sum == 0) ? -1 : (sum + "\n" + (start * start))); // 합이 0이면 완전제곱수가 없음
		br.close();
	}
}