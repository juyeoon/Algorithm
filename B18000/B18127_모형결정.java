import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 18127 - 모형결정
// https://www.acmicpc.net/problem/18127
public class B18127_모형결정 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long n = B + 1;
		long a1 = A - 2;
		long a2 = A - 4;
		System.out.println((a1 * n * n - a2 * n) / 2);
		br.close();
	}
}
