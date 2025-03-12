import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제에 나와있는 조건에 맞게 출력하기
public class B20673_Covid_19 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int p = Integer.parseInt(br.readLine()); // 신규 환자
		int q = Integer.parseInt(br.readLine()); // 신규 입원 환자
		if (p <= 50 && q <= 10) {
			System.out.println("White");
		} else if (q > 30) {
			System.out.println("Red");
		} else {
			System.out.println("Yellow");
		}
		br.close();
	}
}