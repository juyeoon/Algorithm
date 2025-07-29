import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/21185
// 1부터 100 사이의 양의 정수 중 연속된 N개의 숫자를 골랐을 때 그 수들의 합이 짝수인지 홀수인지 확인하는 문제
// 홀수개면 짝수일 수도 있고 홀수일 수도 있음("Either")
// 짝수갠데 4의 배수개면 반드시 짝수("Even")
// 짝수갠데 4의 배수개가 아니면 반드시 홀수("Odd")
public class B21185_Some_Sum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		if (N % 2 == 1) {
			System.out.println("Either");
		} else if (N % 4 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		br.close();
	}
}
