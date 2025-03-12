import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 반복 덧셈 단순 구현
public class B26545_Mathematics {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 덧셈 횟수
		int sum = 0; // 합
		for (int i = 0; i < N; i++) { // 덧셈
			sum += Integer.parseInt(br.readLine());
		}
		System.out.println(sum); // 출력
		br.close();
	}
}