import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2033
public class B2033_반올림 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int place = 10; // 반올림 적용할 자리 수 (1부터 시작)
		while (n >= place) { // n이 현재 자리수 이상일 때만 반올림 수행
			int half = place / 2; // 현재 자리수의 절반
			int remainder = n % place; // 잘라낸 나머지
			n = n - remainder + (remainder >= half ? place : 0); // 반올림 수행 (올림 or 버림)
			place *= 10; // 다음 자리수로
		}
		System.out.println(n); // 출력
		br.close();
	}
}
