import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// (1월부터 x-1월까지의 총 일 수 + x월 1일부터 x월 y일까지의 일 수)을 7로 나눈 후 나머지 0~6을 일~토로 매칭하여 출력
public class B1924_2007년 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int x = Integer.parseInt(s[0]); // x월
		int y = Integer.parseInt(s[1]); // y일
		String day[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" }; // 일~토, 배열의 인덱스와 (총 일 수 % 7)을 매칭
		int sum = 0; // 총 일 수
		for (int i = 1; i < x; i++) { // 1월부터 x-1월까지의 총 일 수
			if (i == 2) { // 2월
				sum += 28;
			} else if (i == 4 || i == 6 || i == 9 || i == 11) { // 4, 6, 9, 11월
				sum += 30;
			} else { // 1, 3, 5, 7, 8, 10, 12월
				sum += 31;
			}
		}
		sum += y; // x월 1일부터 x월 y일까지의 일 수
		System.out.println(day[sum % 7]); // 출력
		br.close();
	}
}