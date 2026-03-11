import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/9317
// 주어진 식을 정리하면
// Horizontal DPI = RH * √337 / (16 * D)
// Vertical DPI = RV * √337 / (9 * D)
public class B9317_Monitor_DPI {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("0 0 0")) {
			StringTokenizer st = new StringTokenizer(s);
			double D = Double.parseDouble(st.nextToken());
			int RH = Integer.parseInt(st.nextToken());
			int RV = Integer.parseInt(st.nextToken());
			double DPIH = RH * Math.sqrt(337) / (16 * D);
			double DPIV = RV * Math.sqrt(337) / (9 * D);
			sb.append(String.format("Horizontal DPI: %.2f\n", DPIH));
			sb.append(String.format("Vertical DPI: %.2f\n", DPIV));
		}
		System.out.println(sb);
		br.close();
	}
}
