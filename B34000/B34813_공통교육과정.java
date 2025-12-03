import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/34813
public class B34813_공통교육과정 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char c = br.readLine().charAt(0);
		if (c == 'F') {
			System.out.println("Foundation");
		} else if (c == 'C') {
			System.out.println("Claves");
		} else if (c == 'V') {
			System.out.println("Veritas");
		} else {
			System.out.println("Exploration");
		}
		br.close();
	}
}
