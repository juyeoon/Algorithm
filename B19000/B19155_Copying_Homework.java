import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/19155
public class B19155_Copying_Homework {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < N; i++) {
			int b = (N + 1) - A[i];
			sb.append(b);
			if (i + 1 < N)
				sb.append(' ');
		}
		System.out.println(sb);
		br.close();
	}
}
