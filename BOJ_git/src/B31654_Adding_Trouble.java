import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// A + B == C이면 "correct!" 출력 아니면 "wrong!"출력
public class B31654_Adding_Trouble {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" "); // A B C
		System.out.println(
				Integer.parseInt(s[0]) + Integer.parseInt(s[1]) == Integer.parseInt(s[2]) ? "correct!" : "wrong!"); // 출력
		br.close();
	}
}