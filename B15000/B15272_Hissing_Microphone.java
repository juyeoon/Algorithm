import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 15272 - Hissing Microphone
// https://www.acmicpc.net/problem/15272
public class B15272_Hissing_Microphone {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println(s.contains("ss") ? "hiss" : "no hiss");
		br.close();
	}
}
