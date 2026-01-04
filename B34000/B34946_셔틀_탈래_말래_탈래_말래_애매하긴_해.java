import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/34946
public class B34946_셔틀_탈래_말래_탈래_말래_애매하긴_해 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		int shuttle = D - (A + B);
		int walk = D - C;
		if (shuttle < 0 && walk < 0) {
			System.out.println("T.T");
		} else if (shuttle < 0 && walk >= 0) {
			System.out.println("Walk");
		} else if (walk < 0) {
			System.out.println("Shuttle");
		} else {
			System.out.println("~.~");
		}
		br.close();
	}
}
