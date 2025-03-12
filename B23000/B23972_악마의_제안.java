import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 처음 금액을 X라고 하면 (X-K)*N>=X를 만족하는 X를 구해야 함
// X >= K * N / (N - 1)
public class B23972_악마의_제안 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long K = Long.parseLong(st.nextToken()); // 악마에게 지불하는 돈
		long N = Long.parseLong(st.nextToken()); // 지불하고 남은 금액을 N배
		if (N == 1) { // N이 1이면 식이 성립 안 됨
			System.out.println(-1);
		} else {
			long min = K * N / (N - 1); // 손해보지 않는 최소값
			if ((K * N) % (N - 1) != 0) { // 나머지가 있으면 정수로 만들기
				min++;
			}
			System.out.println(min); // 출력
		}
		br.close();
	}
}
