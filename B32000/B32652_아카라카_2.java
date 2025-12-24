import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/32652
public class B32652_아카라카_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int K = Integer.parseInt(br.readLine());
		String aka = "AKA";
		String r = "R";
		for (int i = 0; i < K; i++) {
			sb.append(aka).append(r);
		}
		sb.append(aka);
		System.out.println(sb);
		br.close();
	}
}
