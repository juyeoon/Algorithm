import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 단순 구현. if문으로 조건 분기
public class B27328_三方比較_Three_Way_Comparison {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		if (A < B) {
			System.out.println(-1);
		} else if (A > B) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		br.close();
	}
}