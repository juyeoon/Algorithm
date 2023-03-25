import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// T가 무료 시간보다 작은 경우 월 사용료만 납부
// T가 무료 시간보다 큰 경우 월 사용료 + 유료시간 * 1분당 가격 * 일한 날짜 수
public class B20233_Bicycle {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine()); // 월 사용료 1
		int x = Integer.parseInt(br.readLine()); // 유료 시간 1분당 가격 1
		int b = Integer.parseInt(br.readLine()); // 월 사용료 2
		int y = Integer.parseInt(br.readLine()); // 유료 시간 1분당 가격 2
		int T = Integer.parseInt(br.readLine()); // 하루에 사용한 시간
		int c = a + ((T > 30) ? T - 30 : 0) * x * 21; // 경우 1 계산
		int d = b + ((T > 45) ? T - 45 : 0) * y * 21; // 경우 2 계산
		System.out.println(c + " " + d); // 출력
		br.close();
	}
}