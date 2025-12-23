import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/34921
public class B34921_덕후 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		int P = 10 + 2 * (25 - A + T);
		System.out.println(P < 0 ? 0 : P);
		br.close();
	}
}
