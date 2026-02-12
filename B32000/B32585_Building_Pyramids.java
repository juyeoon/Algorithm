import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 32585 - Building Pyramids
// https://www.acmicpc.net/problem/32585
public class B32585_Building_Pyramids {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		long ans = n * (n + 1) * (n + 2) / 6;
		System.out.println(ans);
		br.close();
	}
}
