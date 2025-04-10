import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/3507
// n - a - b == 0 을 만족하는 모든 (a, b) 쌍을 이중 반복문으로 찾아 카운트 후 출력
public class B3507_Automated_Telephone_Exchange {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // Peter의 ATE 인덱스
		int cnt = 0; // 행운의 숫자 개수
		for (int a = 0; a <= 99; a++) { // 행운의 숫자 찾기
			for (int b = 0; b <= 99; b++) {
				if (n - a - b == 0) {
					cnt++;
				}
			}
		}
		System.out.println(cnt); // 출력
	}
}
