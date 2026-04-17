import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

// 32888 - Consolidating Windows 
// https://www.acmicpc.net/problem/32888
public class B32888_Consolidating_Windows {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		double result = Math.sqrt((double)a * a + (double)b * b);
		System.out.printf("%.10f\n", result);
		br.close();
	}
}
