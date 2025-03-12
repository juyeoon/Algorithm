import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 남은 컵케이크 수 = 총 컵케이크 수 - 학생 수
public class B24568_Cupcake_Party {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int R = Integer.parseInt(br.readLine()); // 일반 상자 수
		int S = Integer.parseInt(br.readLine()); // 작은 상자
		System.out.println(R * 8 + S * 3 - 28); // 총 컵케이크 수 - 학생 수
		br.close();
	}
}
