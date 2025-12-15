import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/34824
public class B34824_연대_다음_고대 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		boolean yonseiWon = true;
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			if (s.equals("yonsei")) {
				break;
			} else if (s.equals("korea")) {
				yonseiWon = false;
				break;
			}
		}
		System.out.println(yonseiWon ? "Yonsei Won!" : "Yonsei Lost...");
		br.close();
	}
}
