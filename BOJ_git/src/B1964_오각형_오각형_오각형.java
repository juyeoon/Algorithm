import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 일반항을 구하여 해결
// N단계에서 점의 개수는
// (N * 5) + ((N - 1) * 5 - ((N - 1) * 2 + 1)) + ((N - 2) * 5 - ((N - 2) * 2 + 1)) + ... + (1 * 5 - (1 * 2 + 1))
// = (Σ (5i) (i = 1, N까지)) - (Σ (2i+1) (i = 1, N-1까지))
// = (3n^2+5n+1)/2
public class B1964_오각형_오각형_오각형 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine()); // tmp를 long으로 계산하기 위해서 long으로 선언
		long tmp = (3 * N * N + 5 * N + 2) / 2; // 일반항에 N을 대입하여 구하기
		System.out.println(tmp % 45678); // 점의 개수를 45678로 나눈 나머지 출력
		br.close();
	}
}