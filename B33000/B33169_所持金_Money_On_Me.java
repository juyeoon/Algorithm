import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/33169
// 총 금액 = 1000엔 * A장 + 10000엔 * B장
public class B33169_所持金_Money_On_Me {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		System.out.println(A * 1000 + B * 10000); // 출력
		br.close();
	}
}
