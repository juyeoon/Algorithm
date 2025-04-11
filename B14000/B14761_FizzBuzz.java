import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/14761
// X, Y, N을 입력받고 1부터 N까지 반복하면서
// X와 Y 모두로 나누어 떨어지면 "FizzBuzz"
// X로만 나누어 떨어지면 "Fizz"
// Y로만 나누어 떨어지면 "Buzz"
// 어떤 조건도 아니면 숫자 그대로 출력
public class B14761_FizzBuzz {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		for (int i = 1; i <= n; i++) {
			if (i % x == 0 && i % y == 0) { // X와 Y 모두로 나누어 떨어짐
				System.out.println("FizzBuzz");
			} else if (i % x == 0) { // X로만 나누어 떨어짐
				System.out.println("Fizz");
			} else if (i % y == 0) { // Y로만 나누어 떨어짐
				System.out.println("Buzz");
			} else { // 어떤 조건도 아님
				System.out.println(i);
			}
		}
		br.close();
	}
}
