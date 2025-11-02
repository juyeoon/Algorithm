import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/33571
// 주어진 n 이상인 수 중 가장 작은 자신의 각 자릿수의 합으로 나누어떨어지는 수를 찾는 문제
public class B16861_Harshad_Numbers {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine()); // 입력값 n
		while (true) {
			long sum = digitSum(n); // 현재 수의 자릿수 합 계산
			if (n % sum == 0) { // 나누어떨어지면 Harshad 수
				break;
			}
			n++; // 다음 수로 이동
		}
		System.out.println(n);
		br.close();
	}

	public static long digitSum(long num) { // 자릿수 합을 구하는 함수
		long sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}
}
