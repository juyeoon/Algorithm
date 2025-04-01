import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/33689
// 단순 구현
public class B33689_CPDU {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 문자열 개수
		int cnt = 0; // 'C'로 시작한 문자열의 개수
		for (int i = 0; i < N; i++) {
			if (br.readLine().charAt(0) == 'C') { // 카운트
				cnt++;
			}
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}
