import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// A의 제곱은 B의 제곱보다 N만큼 크다는 조건을 만족하는 A와 B 쌍의 개수
// => B의 제곱 + N의 제곱이 제곱수인지 확인
// 제곱수인지 확인하는 방법 => sqrt()를 1로 나눈 나머지가 0이면 제곱수
public class B6131_완전_제곱수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // N
		int cnt = 0; // A의 제곱은 B의 제곱보다 N만큼 크다는 조건을 만족하는 A와 B 쌍의 개수
		for (int B = 1; B <= 500; B++) {
			int A2 = B * B + N; // A^2
			if (Math.sqrt(A2) % 1 == 0) { // A2가 제곱수이면
				cnt++; // 개수 카운트
			}
			if (A2 >= 250000) { // A>=500 제한
				break;
			}
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}