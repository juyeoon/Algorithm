import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 단순 계산
public class B2420_사파리월드 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" "); // N과 M
		long ans = Math.abs(Long.parseLong(s[0]) - Long.parseLong(s[1])); // |N-M|
		System.out.print(ans);
	}
}
