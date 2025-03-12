import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//배열과 반복문을 이용하여 피보나치 수 계산
public class B2748_피보나치_수2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[] fac = new long[n + 1]; // 팩토리얼 값 저장 배열
		fac[1] = 1;
		for (int i = 2; i <= n; i++) {
			fac[i] = fac[i - 1] + fac[i - 2];
		} // 팩토리얼 계산
		System.out.println(fac[n]);
		br.close();
	}
}
