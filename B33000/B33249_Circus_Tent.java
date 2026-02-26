import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 33249 - Circus Tent
// https://www.acmicpc.net/problem/33249
public class B33249_Circus_Tent {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double d = Double.parseDouble(st.nextToken());
		double h = Double.parseDouble(st.nextToken());
		double R = d / 2.0 + 5.0;
		double area = Math.PI * R * R + 2.0 * Math.PI * R * h;
		System.out.printf("%.15f%n", area);
		br.close();
	}
}
