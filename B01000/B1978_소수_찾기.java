import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1978_소수_찾기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 숫자 개수
		String s[] = br.readLine().split(" "); // 숫자 배열
		int cnt = 0; // 소수 개수
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(s[i]); // 판별할 숫자
			if (num != 1) { // 1이 아니면 소수 판별
				boolean prime_check = true; // true: 소수, false: 합성수
				for (int j = 2; j <= Math.sqrt(num); j++) { // 2부터 소수의 양의 제곱근까지로 나누어 떨어지는지 확인
					if (num % j == 0) { // 나누어 떨어지면
						prime_check = false; // 합성수
						break; // 반복문 탈출
					}
				}
				if (prime_check) { // 소수면
					cnt++; // 개수 증가
				}
			}
		}
		System.out.println(cnt);
		br.close();
	}
}
