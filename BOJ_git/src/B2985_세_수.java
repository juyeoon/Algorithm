import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 모든 조건에 대하여 조건을 나누어서 출력
public class B2985_세_수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" "); // 세 수
		int A = Integer.parseInt(s[0]);
		int B = Integer.parseInt(s[1]);
		int C = Integer.parseInt(s[2]);
		if (A + B == C) {
			System.out.println(A + "+" + B + "=" + C);
		} else if (A - B == C) {
			System.out.println(A + "-" + B + "=" + C);
		} else if (A * B == C) {
			System.out.println(A + "*" + B + "=" + C);
		} else if (A / B == C) {
			System.out.println(A + "/" + B + "=" + C);
		} else if (A == (B + C)) {
			System.out.println(A + "=" + B + "+" + C);
		} else if (A == (B - C)) {
			System.out.println(A + "=" + B + "-" + C);
		} else if (A == (B * C)) {
			System.out.println(A + "=" + B + "*" + C);
		} else if (A == (B / C)) {
			System.out.println(A + "=" + B + "/" + C);
		}
		br.close();
	}
}