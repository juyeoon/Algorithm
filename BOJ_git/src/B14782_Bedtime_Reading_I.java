import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/14782
// 주어진 정수 I의 모든 약수의 합을 구하는 문제
// 1부터 sqrt(I)까지 확인하면서 약수면 더하고 페어가 되는 약수도 더하기
public class B14782_Bedtime_Reading_I {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int I = Integer.parseInt(br.readLine()); // 정수
		int end = (int) Math.sqrt(I); // 반복문 종료 조건
		long sum = 0; // 약수의 합
		for (int j = 1; j <= end; j++) {
			if (I % j == 0) { // 약수면 더하기
				sum += j;
				if (I / j != j) { // 중복되지 않은 페어 약수도 더하기
					sum += I / j;
				}
			}
		}
		System.out.println(sum); // 출력
		br.close();
	}
}
