import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 주어진 수식을 그대로 구현
public class B18301_Rats {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int n1 = Integer.parseInt(s[0]);
		int n2 = Integer.parseInt(s[1]);
		int n12 = Integer.parseInt(s[2]);
		System.out.println((int) ((n1 + 1) * (n2 + 1) / (double) (n12 + 1) - 1));
	}
}
