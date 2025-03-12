import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// for 반복문을 사용하여 ans = a + b를 한 후, a와 b를 갱신
public class B2747_피보나치_수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = 0; // fn-2
		int b = 1; // fn-1
		int ans = 1; // fn
		int n = Integer.parseInt(br.readLine()) - 1; // n
		for (int i = 0; i < n; i++) {
			ans = a + b; // fn = fn-2 + fn-1
			a = b; // fn-2 갱신
			b = ans; // fn-1 갱신
		}
		System.out.println(ans); // 출력
		br.close();
	}
}