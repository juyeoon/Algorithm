import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// StringBuilder를 사용하여 뒤집기
public class B1357_뒤집힌_덧셈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s[] = br.readLine().split(" ");
		int X = Integer.parseInt(s[0]); // X
		int Y = Integer.parseInt(s[1]); // Y
		sb.append(X);
		X = Integer.parseInt(sb.reverse().toString()); // X 뒤집기
		sb.setLength(0);
		sb.append(Y);
		Y = Integer.parseInt(sb.reverse().toString()); // Y 뒤집기
		sb.setLength(0);
		sb.append(X + Y);
		System.out.println(Integer.parseInt(sb.reverse().toString())); // Rev(X) + Rev(Y) 뒤집기
		br.close();
	}
}