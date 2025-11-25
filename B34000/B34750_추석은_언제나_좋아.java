import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/34750
public class B34750_추석은_언제나_좋아 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int P = 0;
		if (N >= 1_000_000) {
			P = N * 20 / 100;
		} else if (N >= 500_000) {
			P = N * 15 / 100;
		} else if (N >= 100_000) {
			P = N * 10 / 100;
		} else {
			P = N * 5 / 100;
		}
		System.out.println(P + " " + (N - P));
		br.close();
	}
}
