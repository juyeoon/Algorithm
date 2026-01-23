import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// 5145 - Subway Fares
// https://www.acmicpc.net/problem/5145
public class B5145_Subway_Fares {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int n = Integer.parseInt(br.readLine());
			int[] price = new int[n];
			for (int i = 1; i <= n - 1; i++) {
				price[i] = Integer.parseInt(br.readLine());
			}
			Map<String, Integer> index = new HashMap<>();
			for (int i = 0; i < n; i++) {
				String station = br.readLine();
				index.put(station, i);
			}
			String start = br.readLine();
			String end = br.readLine();
			int a = index.get(start);
			int b = index.get(end);
			int stops = Math.abs(a - b);
			int fare = price[stops];
			sb.append("Data Set ").append(tc).append(":\n");
			sb.append(fare).append("\n\n");
		}
		System.out.println(sb);
		br.close();
	}
}
