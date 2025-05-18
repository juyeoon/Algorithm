import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// https://www.acmicpc.net/problem/28454
// 입력 받는 날짜가 기준날짜 이후인지 확인하는 문제
// Date와 SimpleDateFormat을 사용하여 날짜 형식으로 비교. ParseException 필요
public class B28454_Gift_Expire_Date {
	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd"); // 날짜 형식
		Date now = formatter.parse(br.readLine()); // 기준 날짜
		int N = Integer.parseInt(br.readLine()); // 입력 날짜 개수
		int cnt = 0; // 기준 날짜 이후인 날짜 개수
		for (int i = 0; i < N; i++) {
			Date emoji = formatter.parse(br.readLine()); // 입력 날짜
			if (emoji.compareTo(now) >= 0) { // 기준 날짜 이후면
				cnt++;
			}
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}
