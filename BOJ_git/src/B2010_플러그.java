import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 콘센트 하나에 멀티탭 하나를 연결할 수 있으므로
// 멀티탭에 꽂을 수 있는 수에 1씩 뺀 값의 합이 답
// 연산 횟수를 줄이기 위해서 멀티탭에 꽂을 수 있는 수를 다 더한 뒤 멀티탭 개수-1을 빼준다
public class B2010_플러그 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 멀티탭 개수
		int ans = 0; // 답
		for (int i = 0; i < N; i++) { // 멀티탭에 꽂을 수 있는 수 더하기
			ans += Integer.parseInt(br.readLine());
		}
		System.out.println(ans - N + 1); // 멀티탭 개수 - 1을 뺀 값을 출력
		br.close();
	}
}
