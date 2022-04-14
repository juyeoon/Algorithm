import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 전체의 78/100
// 전체의 80/100 + 전체의 20/100의 78/100
public class B20492_세금 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println((N * 78 / 100) + " " + (N * 8 / 10 + (N * 2 / 10) * 78 / 100));
		br.close();
	}
}