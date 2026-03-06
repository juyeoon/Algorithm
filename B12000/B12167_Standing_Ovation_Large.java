import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/12167
public class B12167_Standing_Ovation_Large {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("Case #").append(tc).append(": ");
			StringTokenizer st = new StringTokenizer(br.readLine());
			int sMax = Integer.parseInt(st.nextToken());
			String people = st.nextToken();
			int standing = 0;
			int answer = 0;
			for (int i = 0; i <= sMax; i++) {
				int cnt = people.charAt(i) - '0';
				if (standing < i) {
					int need = i - standing;
					answer += need;
					standing += need;
				}
				standing += cnt;
			}
			sb.append(answer).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
