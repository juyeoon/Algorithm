import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 34849 - 이중 반복문
// https://www.acmicpc.net/problem/34849
public class B34849_이중_반복문 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println((N <= 10_000) ? "Accepted" : "Time limit exceeded");
		br.close();
	}
}
