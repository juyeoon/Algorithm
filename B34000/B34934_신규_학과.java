import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 34934 - 신규 학과
// https://www.acmicpc.net/problem/34934
public class B34934_신규_학과 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String ans = "";
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String deptName = st.nextToken();
			int y = Integer.parseInt(st.nextToken());
			if (y == 2026) {
				ans = deptName;
			}
		}
		System.out.println(ans);
		br.close();
	}
}
