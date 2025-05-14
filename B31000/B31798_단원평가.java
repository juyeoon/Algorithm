import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/31798
// a + b = c * c
// a = c * c - b
// b = c * c - a
// c = sqrt(a + b)
public class B31798_단원평가 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		if (c == 0) { // c 구하기
			System.out.println((int) Math.sqrt(a + b));
		} else { // a나 b 구하기
			System.out.println(c * c - (a + b));
		}
		br.close();
	}
}
