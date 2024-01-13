import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10 이하의 수는 모두 신기한 수
// 12 이상의 수는 브루트포스 알고리즘으로 구하기 (11은 신기한 수가 아님)
// 각 자릿수의 합 => [10으로 나눈 나머지를 더하고 10으로 나눈 값으로 변경]을 1미만이 될 때까지 반복
public class B17618_신기한_수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // N
		int cnt = 0; // 신기한 수의 개수
		if (N < 11) { // 10 이하의 수는 모두 신기한 수
			cnt = N;
		} else {
			cnt = 10; // 10 이하의 수는 모두 신기한 수
			for (int i = 12; i <= N; i++) { // 12부터 N까지(11은 신기한 수가 아님)
				int sum = 0; // 각 자릿수의 합
				int tmp = i; // 각 자릿수의 합을 구하기 위한 변수
				while (tmp >= 1) { // 각 자릿수의 합 구하기
					sum += tmp % 10;
					tmp /= 10;
				}
				if (i % sum == 0) { // 각 자릿수의 합을 나눈 나머지가 0이면 신기한 수
					cnt++;
				}
			}
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}