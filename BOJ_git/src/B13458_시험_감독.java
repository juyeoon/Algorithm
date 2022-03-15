import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B13458_시험_감독 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 시험장 개수
		String a[] = br.readLine().split(" ");
		String bc[] = br.readLine().split(" ");
		int B = Integer.parseInt(bc[0]); // 총감독관이 한 시험장에서 감시할 수 있는 응시자 수
		int C = Integer.parseInt(bc[1]); // 부감독관이 한 시험장에서 감시할 수 있는 응시자 수
		long ans = 0; // 답
		for (int i = 0; i < N; i++) {
			int A = Integer.parseInt(a[i]); // 한 시험장의 응시자수
			ans++; // 총감독관
			if (A > B) { // 부감독관
				ans += (A - B) / C;
				if ((A - B) % C != 0) ans++;
			}
		}
		System.out.println(ans);
		br.close();
	}
}
