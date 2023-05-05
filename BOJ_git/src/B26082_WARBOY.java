import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// WARBOY의 성능 = 경쟁사의 성능 / 경쟁사의 가격 * 3 * WARBOY의 가격
public class B26082_WARBOY {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int A = Integer.parseInt(s[0]); // 경쟁사의 가격
		int B = Integer.parseInt(s[1]); // 경쟁사의 성능
		int C = Integer.parseInt(s[2]); // WARBOY의 가격
		System.out.println(B / A * 3 * C); // 출력
		br.close();
	}
}