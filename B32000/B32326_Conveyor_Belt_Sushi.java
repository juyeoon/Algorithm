import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 총 금액 = (빨간 접시 수 * 3달러) + (초록 접시 수 * 4달러) + (파란 접시 수 * 5달러)
public class B32326_Conveyor_Belt_Sushi {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int R = Integer.parseInt(br.readLine()); // 빨간색
		int G = Integer.parseInt(br.readLine()); // 초록색
		int B = Integer.parseInt(br.readLine()); // 파란색
		System.out.println(R * 3 + G * 4 + B * 5); // 총 금액 출력
		br.close();
	}
}
