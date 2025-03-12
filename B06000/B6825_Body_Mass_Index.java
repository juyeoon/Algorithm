import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제에 주어진 식으로 BMI를 구한 후 if-else문으로 조건 분기
public class B6825_Body_Mass_Index {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double W = Double.parseDouble(br.readLine()); // 무게
		double H = Double.parseDouble(br.readLine()); // 키
		double BMI = W / (H * H); // BMI
		if (BMI > 25) { // More than 25
			System.out.println("Overweight");
		} else if (BMI < 18.5) { // Less than 18.5
			System.out.println("Underweight");
		} else { // Between 18.5 and 25.0 (inclusive)
			System.out.println("Normal weight");
		}
		br.close();
	}
}