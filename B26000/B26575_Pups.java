import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// (총 금액) = (마리 수) * (마리 당 먹는 파운드) * (파운드 당 가격)
public class B26575_Pups {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine().trim()); // 입력 문자열 수
		for (int i = 0; i < N; i++) {
			String s[] = br.readLine().split(" ");
			double d = Double.parseDouble(s[0]); // 마리 수
			double f = Double.parseDouble(s[1]); // 마리 당 먹는 파운드
			double p = Double.parseDouble(s[2]); // 파운드 당 가격
			sb.append("$").append(String.format("%.2f", d * f * p)).append("\n"); // 지불해야하는 총 금액
		}
		System.out.println(sb); // 출력
		br.close();
	}
}