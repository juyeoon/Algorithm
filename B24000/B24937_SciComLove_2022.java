import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24937 - SciComLove (2022)
// https://www.acmicpc.net/problem/24937
public class B24937_SciComLove_2022 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "SciComLove";
		int N = Integer.parseInt(br.readLine());
		N %= s.length();
		sb.append(s.substring(N)).append(s.substring(0, N));
		System.out.println(sb);
		br.close();
	}
}
