import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 제한 속도에서 현재 속도를 뺀 속도를 if-else 문을 사용해서 구분
public class B6763_Speed_fines_are_not_fine느낌표 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int dif = Integer.parseInt(br.readLine()) - Integer.parseInt(br.readLine()); // 제한 속도 - 현재 속도
		if (dif >= 0) {
			System.out.println("Congratulations, you are within the speed limit!"); // 제한 속도 이내
		} else if (dif <= -1 && dif >= -20) {
			System.out.println("You are speeding and your fine is $100."); // 초과 속도 1 ~ 20
		} else if (dif <= -21 && dif >= -30) {
			System.out.println("You are speeding and your fine is $270."); // 초과 속도 21 ~ 30
		} else {
			System.out.println("You are speeding and your fine is $500."); // 초과 속도 31 ~
		}
		br.close();
	}
}