import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 34922 - 사각지대 
// https://www.acmicpc.net/problem/34922
public class B34922_사각지대 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double w = Double.parseDouble(st.nextToken());
		double h = Double.parseDouble(st.nextToken());
		double r = Double.parseDouble(br.readLine());
		double totalArea = w * h;
		double visibleArea = Math.PI * r * r / 4.0;
		double blindArea = totalArea - visibleArea;
		System.out.printf("%.10f%n", blindArea);
		br.close();
	}
}
