import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10953 - A+B - 6
// https://www.acmicpc.net/problem/10953
public class B10953_A_더하기_B_6번 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
//		StringTokenizer st = null;
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		String s[] = br.readLine().split(" ");
//		double R = Double.parseDouble(s[0]);
//		double C = Double.parseDouble(s[1]);
		int T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			String s[] = br.readLine().split(",");
			sb.append(Integer.parseInt(s[0])+Integer.parseInt(s[1])).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
