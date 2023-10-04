import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1부터 N까지 수의 합 = N * (N + 1) / 2
// 1부터 N까지 수의 합을 제곱한 수 = (N * (N + 1) / 2)^2
// 1부터 N까지 수의 세제곱의 합 = 1부터 N까지 수의 합을 제곱한 수
public class B28701_세제곱의_합 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 정수 N
		int sum = N * (N + 1) / 2; // 1부터 N까지 수의 합
		sb.append(sum).append("\n").append(sum * sum).append("\n").append(sum * sum);
		System.out.println(sb); // 출력
		br.close();
	}
}