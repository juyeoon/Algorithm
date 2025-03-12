import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//A＠B = (A+B)×(A-B) = A^2 - B^2
public class B15964_이상한_기호 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		long A = Long.parseLong(s[0]);
		long B = Long.parseLong(s[1]);
		System.out.println(A * A - B * B);
		br.close();
	}
}
