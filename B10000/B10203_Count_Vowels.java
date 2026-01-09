import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/10203
public class B10203_Count_Vowels {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			int cnt = 0;
			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				if (c == 'a' || c == 'e' || c == 'o' || c == 'i' || c == 'u') {
					cnt++;
				}
			}
			sb.append("The number of vowels in ").append(s).append(" is ").append(cnt).append(".\n");
		}
		System.out.println(sb);
		br.close();
	}
}
