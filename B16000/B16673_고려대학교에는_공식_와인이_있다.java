import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 자연수 거듭제곱의 합 공식을 이용하여 시그마를 다항식으로 표현
// Kn (n=1,...,C) => K * C * (C + 1) / 2
// Pn^2 (n=1,...,C) => P * C * (C + 1) * (2 * C + 1) / 6
public class B16673_고려대학교에는_공식_와인이_있다 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int C = Integer.parseInt(s[0]); // 와인을 모은 년수
		int K = Integer.parseInt(s[1]); // 고려대 애착 정도
		int P = Integer.parseInt(s[2]); // 구매중독 정도
		System.out.println((K * C * (C + 1) / 2) + (P * C * (C + 1) * (2 * C + 1) / 6)); // 출력
		br.readLine();
	}
}
