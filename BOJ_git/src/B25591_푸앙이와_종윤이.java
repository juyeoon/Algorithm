import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제에 적힌 대로 계산 후 출력
public class B25591_푸앙이와_종윤이 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int X = Integer.parseInt(s[0]);
		int Y = Integer.parseInt(s[1]);
		int a = 100 - X;
		int b = 100 - Y;
		int c = 100 - a - b;
		int d = a * b;
		int q = d / 100;
		int r = d % 100;
		System.out.println(a + " " + b + " " + c + " " + d + " " + q + " " + r);
		System.out.println((c + q) + " " + r);
		br.close();
	}
}