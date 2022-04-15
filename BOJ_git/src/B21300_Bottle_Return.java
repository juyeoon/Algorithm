import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 전체 합 * 5
public class B21300_Bottle_Return {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int sum = 0;
		for (int i = 0; i < s.length; i++) {
			sum += Integer.parseInt(s[i]);
		}
		System.out.println(sum * 5);
	}
}
