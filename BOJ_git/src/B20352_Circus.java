import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 원의 넓이를 원의 둘레로 바꾸는 문제
// (원의 둘레) = (원의 반지름) * 2 * PI
// (원의 반지름) = sqrt(원의 넓이 / PI)
public class B20352_Circus {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double a = Double.parseDouble(br.readLine()); // 원의 넓이
		System.out.println(String.format("%.10f", Math.sqrt(a / Math.PI) * 2 * Math.PI)); // 원의 둘레 출력
		br.close();
	}
}