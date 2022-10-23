import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 도미노 N세트에 찍힌 점의 개수의 합은 
// 1에서 N까지의 수에 N+2만큼의 값을 각각 곱한 수의 합과 같음
// => (1에서 N까지의 합) * (N+2)
public class B2921_도미노 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 도미노 세트 수
		int sum = 0; // 1에서 N까지의 합
		for (int i = 1; i <= N; i++) { // sum 구하기
			sum += i;
		}
		System.out.println(sum * (N + 2)); // 점의 개수의 합 = (1에서 N까지의 합) * (N+2)
		br.close();
	}
}