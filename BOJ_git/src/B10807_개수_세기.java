import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 0~200(크기 201) 배열을 만들어서 (입력 숫자 + 100) 자리에 +1(-100~100이기 때문)
public class B10807_개수_세기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 정수 개수
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt[] = new int[201]; // 개수 저장 배열
		for (int i = 0; i < N; i++) {
			cnt[Integer.parseInt(st.nextToken()) + 100]++; // 개수 count
		}
		System.out.println(cnt[Integer.parseInt(br.readLine()) + 100]); // 입력받은 숫자 개수 출력
	}
}
