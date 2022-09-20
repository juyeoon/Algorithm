import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10권 가격에서 9권의 책 가격 빼기
public class B5565_영수증 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 10권 가격 총 합
		for (int i = 0; i < 9; i++) { // 9권의 가격 빼기
			N -= Integer.parseInt(br.readLine());
		}
		System.out.println(N); // 빼고 남은 값 출력
		br.close();
	}
}