import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1부터 10 ^ 18 사이에서 연속하는 N개의 자연수를 선택했을 때, 합이 홀인지 짝인지 맞추는 문제
// N이 홀수이면 연속하는 수의 시작이 홀인지 짝인지에 따라 다름 => 0 출력
// N이 짝수고 N/2가 홀수이면 속하는 수의 시작이 홀인지 짝인지 상관없이 홀 => 1출력
// N이 짝수고 N/2가 짝수이면 속하는 수의 시작이 홀인지 짝인지 상관없이 짝 => 2출력
public class B18005_Even_or_Odd {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		if (N % 2 == 1) { // N이 홀수
			System.out.println(0);
		} else { // N이 짝수
			if ((N / 2) % 2 == 1) { // N/2가 홀수
				System.out.println(1);
			} else { // N/2가 짝수
				System.out.println(2);
			}
		}
		br.close();
	}
}