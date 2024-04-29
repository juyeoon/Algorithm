import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 오늘이 n일(일요일)이고 2주전 일요일은 m일일 때, 1주전 일요일의 날짜는 며칠인지 구하는 문제(한 달은 28,29,30,31 중 하나)
// 지난 달의 마지막 날을 먼저 구함 => n - 14 + 마지막 날  = m => 마지막 날  = m - n + 14
// 1주 전 일요일의 날짜 => m + 7. 여기서 계산한 결과가 마지막 날을 넘어가면 마지막 날 빼기
public class B27182_Rain_Diary {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]); // 오늘 날짜
		int m = Integer.parseInt(s[1]); // 2주 전 날짜
		int endDay = m - n + 14; // 지난 달의 마지막 날
		int ans = m + 7; // 1주 전 일요일 날짜
		ans = ans > endDay ? ans - endDay : ans; // 후처리
		System.out.println(ans); // 출력
		br.close();
	}
}