import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 11434 - Ampelmännchen
// https://www.acmicpc.net/problem/3351143471
public class B11434_Ampelmännchen {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			int sum = 0;
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				int lww = Integer.parseInt(st.nextToken());
				int lwe = Integer.parseInt(st.nextToken());
				int lew = Integer.parseInt(st.nextToken());
				int lee = Integer.parseInt(st.nextToken());
				int likew = W * lww + E * lew;
				int likee = W * lwe + E * lee;
				sum += Math.max(likee, likew);
			}
			sb.append("Data Set ").append(tc).append(":\n").append(sum).append("\n\n");
		}
		System.out.println(sb);
		br.close();
	}
}
