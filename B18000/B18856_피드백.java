import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/18856
public class B18856_피드백 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		sb.append(N).append("\n");
		for (int i = 1; i < N; i++) {
			sb.append(i).append(" ");
		}
		sb.append(53);
		System.out.println(sb);
		br.close();
	}
}
