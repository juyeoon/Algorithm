import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/5101
// 등차수열의 항은 a+d(n-1), n은 1이상의 정수여야 등차수열이 성립함
public class B5101_Sequences {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()); // 첫번째 항
			int d = Integer.parseInt(st.nextToken()); // 공차
			int x = Integer.parseInt(st.nextToken()); // 확인할 항의 값
			if (a == 0 && d == 0 && x == 0) { // EOI
				break;
			}
			if ((x - a) % d != 0) { // 등차수열이 아님
				sb.append("X");
			} else {
				int n = (x - a) / d + 1;
				if (n > 0) { // 등차수열 맞음
					sb.append(n);
				} else { // 첫번째 항보다 앞
					sb.append("X");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
