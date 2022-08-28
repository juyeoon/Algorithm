import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 조건에 따라 다르게 출력하기
public class B20499_Darius님_한타_안_함qus {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split("/"); // '/'으로 구분
		int K = Integer.parseInt(s[0]);
		int D = Integer.parseInt(s[1]);
		int A = Integer.parseInt(s[2]);
		System.out.println((D == 0 || K + A < D) ? "hasu" : "gosu"); // D가 0이거나 K+A가 D보다 작으면 hasu, 그 외는 gosu
		br.close();
	}
}
