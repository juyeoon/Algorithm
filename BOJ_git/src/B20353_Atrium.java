import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 정사각형의 넓이를 둘레로 바꾸는 문제
public class B20353_Atrium {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double a = Double.parseDouble(br.readLine()); // 정사각형 넓이
		System.out.println(String.format("%.8f", Math.sqrt(a) * 4)); // 둘레 출력
		br.close();
	}
}