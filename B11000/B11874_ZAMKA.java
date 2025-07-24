import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/30684
// 수의 범위가 작기 때문에 브루트포스 탐색이 가능 (최대 10,000개)
// 자릿수 합 계산은 digitSum 함수로 수행
// 최솟값 N은 작은 수부터 확인 후 처음 찾은 수가 N
// 최댓값 M은 큰 수부터 확인 후 처음 찾은 수가 M
public class B11874_ZAMKA {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine()); // 시작 숫자
		int D = Integer.parseInt(br.readLine()); // 끝 숫자
		int X = Integer.parseInt(br.readLine()); // 원하는 자리 수 합
		int N = -1; // 조건을 만족하는 최솟값
		for (int i = L; i <= D; i++) { // L부터 D까지 순차적으로 탐색하여 조건을 만족하는 가장 작은 수를 찾음
			if (digitSum(i) == X) {
				N = i;
				break; // 처음 발견한 값이 최소값이므로 바로 종료
			}
		}
		int M = -1; // 조건을 만족하는 최대값
		for (int i = D; i >= L; i--) { // D부터 L까지 역순으로 탐색하여 조건을 만족하는 가장 큰 수를 찾음
			if (digitSum(i) == X) {
				M = i;
				break; // 처음 발견한 값이 최대값이므로 바로 종료
			}
		}
		System.out.println(N + "\n" + M); // 출력
		br.close();
	}

	public static int digitSum(int num) { // 주어진 숫자의 자릿수 합을 계산하는 함수
		int sum = 0;
		while (num > 0) { // 각 자릿수를 더함 (일의 자리부터 차례대로)
			sum += num % 10; // 현재 자릿수를 더함
			num /= 10; // 다음 자릿수로 이동
		}
		return sum;
	}
}
