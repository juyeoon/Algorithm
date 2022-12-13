import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1 + n + n^2 + n^3 + n^4을 구하는 문제 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("0")) { // EOF
			double data = Double.parseDouble(s); // n
			double ans = 0; // 결과값
			for (int i = 0; i <= 4; i++) { // 1 + n + n^2 + n^3 + n^4 구하기
				ans += Math.pow(data, i);
			}
			sb.append(String.format("%.2f", ans)).append("\n"); // 소수 둘째자리까지 반올림
		}
		System.out.println(sb); // 출력
		br.close();
	}
}