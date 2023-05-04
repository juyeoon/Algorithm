import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// (100원 개수 * 100) >= (초코바 가격)이면 살 수 있음
public class B27959_초코바 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]); // 100원 개수
		int M = Integer.parseInt(s[1]); // 초코바 가격
		System.out.println((N * 100 >= M) ? "Yes" : "No"); // 출력
		br.close();
	}
}