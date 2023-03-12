import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1갤런 당 x마일 = 3.785411784리터 당 x * 1609.344미터
// 100km에 사용되는 연료 리터는
// 3.785411784 / (x * 1609.344) * 100000
public class B14065_Gorivo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double x = Double.parseDouble(br.readLine()); // x마일
		double liter = 3.785411784; // 리터
		double meter = x * 1609.344; // 미터
		System.out.println(String.format("%.6f", liter / meter * 100000)); // 반올림
		br.close();
	}
}