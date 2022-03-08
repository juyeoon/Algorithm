import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2908_상수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		s[0] = s[0].charAt(2) + "" + s[0].charAt(1) + "" + s[0].charAt(0) + ""; // swap
		s[1] = s[1].charAt(2) + "" + s[1].charAt(1) + "" + s[1].charAt(0) + ""; // swap
		System.out.println(Math.max(Integer.parseInt(s[0]), Integer.parseInt(s[1]))); // 최댓값 출력
		br.close();
	}
}
