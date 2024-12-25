import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/14954
// 어떤 정수의 각 자리 수를 제곱한 값을 더하는 작업을 반복했을 때 1이 되면 행복한 수
// 4가 되면 행복하지 않은 수
public class B14954_Happy_Number {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 주어진 정수
		boolean happy = false; // 행복한 수 여부 (true: 행복)
		int fn = N; // 각 자리 수를 제곱한 값의 합
		while (fn != 4) { // 4가 될때까지 반복
			int tmp = 0;
			while (fn > 0) { // 각 자리 수의 제곱의 합 구하기
				tmp += Math.pow(fn % 10, 2);
				fn /= 10;
			}
			fn = tmp;
			if (fn == 1) { // 1이 되면 행복한 수
				happy = true;
				break;
			}
		}
		System.out.println(happy ? "HAPPY" : "UNHAPPY"); // 출력
		br.close();
	}
}
