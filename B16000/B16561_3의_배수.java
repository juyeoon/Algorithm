import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제를 다항식으로 표현하면 3x + 3y + 3z = N (x,y,z는 자연수)
// => x + y + z = N/3
// => 3 H (N/3 - 3)
// = (N/3 - 1) C (N/3 - 3)
// = (N/3 - 1) C 2
// = (N/3 - 1) * (N/3 - 2) / 2
public class B16561_3의_배수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		System.out.println((N / 3 - 1) * (N / 3 - 2) / 2);
		br.close();
	}
}