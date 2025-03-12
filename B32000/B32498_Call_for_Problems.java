import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 홀수의 개수를 구하는 문제
// 단순 구현
public class B32498_Call_for_Problems {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 입력 개수
		int cnt = 0; // 홀수의 개수
		for (int i = 0; i < N; i++) {
			if (Integer.parseInt(br.readLine()) % 2 == 1) { // 홀수면
				cnt++; // 카운트
			}
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}
