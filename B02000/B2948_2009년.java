import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1년 1월 1일부터 2009년 1월 1일까지 날짜를 계산 후
// 2009년 1월 1일부터 2009년 M월 D일까지의 날자를 더한 후
// 나누기 7
public class B2948_2009년 {
	public static final String weekday[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
			"Saturday" }; // 요일
	public static final int days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 각 달의 날 수

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int D = Integer.parseInt(s[0]); // D일
		int M = Integer.parseInt(s[1]); // M월
		int day = 365 * 2008 + (2008 / 4 - 2008 / 100 + 2008 / 400); // 1년 1월 1일부터 2009년 1월 1일까지 날짜를 계산
		day += D; // D일 추가
		for (int i = 0; i < M - 1; i++) {
			day += days[i]; // 1월부터 M월까지의 날짜 추가
		}
		System.out.println(weekday[day % 7]); // 출력
		br.close();

	}
}