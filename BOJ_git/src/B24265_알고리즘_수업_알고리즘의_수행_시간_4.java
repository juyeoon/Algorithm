import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 코드 1의 수행 횟수는 (n-1)+(n-2)+...+1이므로 등차수열 합 공식을 이용하여 (N - 1) * N / 2 
// 시간복잡도는 O(n^2)이므로 두 번째 줄에 2 출력
public class B24265_알고리즘_수업_알고리즘의_수행_시간_4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		System.out.println((N - 1) * N / 2); // 수행 횟수
		System.out.println(2); // 차수
		br.readLine();
	}
}