import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2의 제곱수 다음 수 부터 다음 제곱수까지 2부터 2의 배수가 정답이라는 규칙을 이용
// 시간을 절반 이상으로 줄일 수 있음
public class B2164_카드2_refer {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		if (N <= 3) {
			sb.append(N);
		} else {
			int i = 262144; // 2^15 : 50만 보다 작은 2의 제곱수 중에 가장 큰 수
			while (true) {
				if (i == N) { // N이 2의 제곱수
					sb.append(N);
					break;
				} else if (i < N) {
					sb.append((N - i) * 2); // 2부터 2의 배수
					break;
				} else { // i > N -> i 반으로 줄이기(지수-1)
					i /= 2;
				}
			}
		}
		System.out.println(sb);
	}
}
