import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 27566 - Blueberry Waffle
// https://www.acmicpc.net/problem/27566
public class B27566_Blueberry_Waffle {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long r = Long.parseLong(st.nextToken());
		long f = Long.parseLong(st.nextToken());
		long rem = (180L * f) % (360L * r);
		long ninety = 90L * r;
		long twoSeventy = 270L * r;
		System.out.println((rem > ninety && rem < twoSeventy) ? "down" : "up");
		br.close();
	}
}
