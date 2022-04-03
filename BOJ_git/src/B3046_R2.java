import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// R2 = S * 2 - R1
public class B3046_R2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" "); // s[0] = R1, s[1] = S
		System.out.println(Integer.parseInt(s[1]) * 2 - Integer.parseInt(s[0]));
		br.close();
	}
}