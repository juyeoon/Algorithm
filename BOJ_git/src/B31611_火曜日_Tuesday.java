import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 오늘이 일요일이면 2일 후가 화요일
// 일주일은 7일 주기이므로 (X를 7로 나눈 나머지)일 후와 요일이 같음
// 따라서 X를 7로 나눈 나머지가 2이면 화요일
public class B31611_火曜日_Tuesday {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine()); // X일 후
		System.out.println(X % 7 == 2 ? 1 : 0); // 출력
		br.close();
	}
}