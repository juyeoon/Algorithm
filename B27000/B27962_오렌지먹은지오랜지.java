import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 27962 - 오렌지먹은지오랜지
// https://www.acmicpc.net/problem/27962
public class B27962_오렌지먹은지오랜지 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		boolean yes = false;
		for (int i = 1; i <= n; i++) {
			int diff = 0;
			for (int j = 0; j < i; j++) {
				if (s.charAt(j) != s.charAt(n - i + j)) {
					diff++;
					if (diff > 1) {
						break;
					}
				}
			}
			if (diff == 1) {
				yes = true;
				break;
			}
		}
		System.out.println(yes ? "YES" : "NO");
		br.close();
	}
}
