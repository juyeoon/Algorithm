import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 666부터 1 증가(브루트포스)
// contains() 사용
// 158444KB 340ms
public class B1436_영화감독_숌_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 편 수
		int ans = 666;
		int cnt = 1;
		while (cnt < N) {
			if (Integer.toString(++ans).contains("666")) cnt++;
		}
		System.out.println(ans);
		br.close();
	}
}
