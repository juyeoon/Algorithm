import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 증가 인구 수 => t/4
// 감소 인구수 => t/7
public class B26561_Population {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine()); // 입력 line 수
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken()); // 처음 인구수
			int t = Integer.parseInt(st.nextToken()); // 지난 시간
			p += t / 4; // 증가 인구 계산
			p -= t / 7; // 감소 인구 계산
			sb.append(p).append("\n"); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}