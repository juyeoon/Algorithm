import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 15633 - Fan Death
// https://www.acmicpc.net/problem/15633
public class B15633_Fan_Death {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringBuilder sb = new StringBuilder();
//		StringTokenizer st = null;
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(br.readLine());
		int end = (int) Math.sqrt(n);
		long sum = 0;
		for (int i = 1; i <= end; i++) {
			if (n % i == 0) {
				sum += i;
				if (n / i != i) {
					sum += n / i;
				}
			}
		}
		bw.write(String.valueOf(sum * 5 - 24));
		bw.flush();
		bw.close();
		br.close();
	}
}