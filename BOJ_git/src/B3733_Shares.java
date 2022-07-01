import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// S값을 N+1로 나누는 문제
// EOF 사용해야 함
public class B3733_Shares {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String s = "";
		while ((s = br.readLine()) != null) { // EOF
			st = new StringTokenizer(s);
			int N = Integer.parseInt(st.nextToken()); // N명의 사람
			int S = Integer.parseInt(st.nextToken()); // S
			// 1명의 judge + N명이 S를 나누어 가지므로 최댓값 x는 S값을 N+1로 나눈 것과 같음
			sb.append(S / (N + 1)).append("\n");
		}
		System.out.println(sb);
	}
}
