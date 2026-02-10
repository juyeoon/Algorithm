import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 5013 - Death Knight Hero
// https://www.acmicpc.net/problem/5013
public class B5013_Death_Knight_Hero {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if(!br.readLine().contains("CD")) {
				cnt++;
			}
		}
		System.out.println(cnt);
		br.close();
	}
}
