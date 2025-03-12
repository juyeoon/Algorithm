import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//공부한 페이지 수가 계획한 수 이상이면 카운트
public class B30033_Rust_Study {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 계획하고 공부한 일수
		String A[] = br.readLine().split(" "); // 공부하고자 계획한 페이지 수
		String B[] = br.readLine().split(" "); // 공부한 페이지 수
		int cnt = 0; // 계획한 페이지 수 이상으로 공부한 횟수
		for (int i = 0; i < N; i++) {
			if (Integer.parseInt(A[i]) <= Integer.parseInt(B[i])) { // 공부한 페이지 수가 계획한 수 이상이면
				cnt++; // 카운트
			}
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}