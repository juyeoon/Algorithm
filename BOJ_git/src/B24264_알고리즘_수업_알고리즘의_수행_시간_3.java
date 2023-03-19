import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 주어진 알고리즘의 시간복잡도는 O(n^2)
public class B24264_알고리즘_수업_알고리즘의_수행_시간_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		System.out.println(n * n); // 코드 실행 횟수
		System.out.println(2); // 시간복잡도는 O(n^2)이므로 최고차항의 차수는 2
		br.close();
	}
}