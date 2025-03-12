import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 두 수가 서로소임이 보장되기 때문에 1-(A/B)를 기약분수로 표현하면 (B-A)/B이다
public class B16430_제리와_톰 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int A = Integer.parseInt(s[0]);
		int B = Integer.parseInt(s[1]);
		System.out.println((B - A) + " " + B);
	}
}
